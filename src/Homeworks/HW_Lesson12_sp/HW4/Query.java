package Homeworks.HW_Lesson12_sp.HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Query {
    private static final String API_URL = "https://api.monobank.ua/bank/currency12";

    public void fetchResults() {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String output = reader.readLine();

            Results results = new Results(output);
            results.printResults();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}