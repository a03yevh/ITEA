package Homeworks.HW_Lesson12_sp.HW4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Results {
    private JSON[] results;

    public Results(String json) {
        Gson gson = new GsonBuilder().create();
        this.results = gson.fromJson(json, JSON[].class);
    }

    public void printResults() {
        for (JSON result : results) {
            System.out.println("Currency A: " + result.getCurrencyCodeA() +
                    ", Currency B: " + result.getCurrencyCodeB() +
                    ", Date: " + result.getDate() +
                    ", Rate Buy: " + result.getRateBuy() +
                    ", Rate Cross: " + result.getRateCross() +
                    ", Rate Sell: " + result.getRateSell());
        }
    }
}