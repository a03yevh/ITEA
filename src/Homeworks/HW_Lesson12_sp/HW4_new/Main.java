package Homeworks.HW_Lesson12_sp.HW4_new;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

// Завдання 5: взяти будь яку api будь якого банку та розпарсити за допомогою json.

public class Main {
    public static void main(String[] args) throws IOException {
        String apiEndpoint = "https://api.monobank.ua/bank/currency";
        String json = getJsonFromApi(apiEndpoint);

        List<Map<String, Object>> result = parseJsonArray(json);
        for (Map<String, Object> map : result) {
            System.out.println(map);
        }
    }

    public static String getJsonFromApi(String apiEndpoint) throws IOException {
        URL url = new URL(apiEndpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode < 200 || responseCode > 299) {
            throw new IOException("Request failed. HTTP Error Code: " + responseCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();
        conn.disconnect();

        return content.toString();
    }

    public static List<Map<String, Object>> parseJsonArray(String jsonArray) {
        List<Map<String, Object>> result = new ArrayList<>();

        String[] jsonObjects = jsonArray.substring(1, jsonArray.length() - 1).split("\\},\\{");
        for (String jsonObject : jsonObjects) {
            if (!jsonObject.startsWith("{")) {
                jsonObject = "{" + jsonObject;
            }
            if (!jsonObject.endsWith("}")) {
                jsonObject = jsonObject + "}";
            }
            result.add(parseJsonObject(jsonObject));
        }

        return result;
    }

    public static Map<String, Object> parseJsonObject(String jsonObject) {
        Map<String, Object> result = new HashMap<>();

        String[] keyValuePairs = jsonObject.substring(1, jsonObject.length() - 1).split(",");
        for (String keyValuePair : keyValuePairs) {
            String[] keyValue = keyValuePair.split(":");
            String key = keyValue[0].substring(1, keyValue[0].length() - 1);
            Object value;
            if (keyValue[1].startsWith("\"")) {
                value = keyValue[1].substring(1, keyValue[1].length() - 1);
            } else if (keyValue[1].equals("true")) {
                value = true;
            } else if (keyValue[1].equals("false")) {
                value = false;
            } else if (keyValue[1].equals("null")) {
                value = null;
            } else {
                value = Double.parseDouble(keyValue[1]);
            }
            result.put(key, value);
        }

        return result;
    }
}
