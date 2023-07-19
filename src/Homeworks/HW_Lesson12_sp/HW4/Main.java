package Homeworks.HW_Lesson12_sp.HW4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        String request = "https://api.monobank.ua/bank/currency";

        String result = performRequest(request);

        Gson gson = new GsonBuilder().create();
        CurrencyRate[] rates = gson.fromJson(result, CurrencyRate[].class);

        for (CurrencyRate rate : rates) {
            System.out.println("currencyCodeA: " + rate.getCurrencyCodeA() +
                    ", currencyCodeB: " + rate.getCurrencyCodeB() +
                    ", rateBuy: " + rate.getRateBuy() +
                    ", rateCross: " + rate.getRateCross() +
                    ", rateSell: " + rate.getRateSell());
        }

        System.out.println("JSON: \n\t" + gson.toJson(rates));
    }

    private static String performRequest(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();

        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        try {
            int responseCode = http.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new IOException("HTTP-response code: " + responseCode);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];

            int r = 0;
            do {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            } while (r > 0);
        } finally {
            http.disconnect();
        }
        return sb.toString();
    }
}