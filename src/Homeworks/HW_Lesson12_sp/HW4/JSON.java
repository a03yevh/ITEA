package Homeworks.HW_Lesson12_sp.HW4;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JSON {
    @SerializedName("currencyCodeA")
    @Expose
    private int currencyCodeA;

    @SerializedName("currencyCodeB")
    @Expose
    private int currencyCodeB;

    @SerializedName("date")
    @Expose
    private int date;

    @SerializedName("rateBuy")
    @Expose
    private double rateBuy;

    @SerializedName("rateCross")
    @Expose
    private double rateCross;

    @SerializedName("rateSell")
    @Expose
    private double rateSell;

    public int getCurrencyCodeA() {
        return currencyCodeA;
    }

    public int getCurrencyCodeB() {
        return currencyCodeB;
    }

    public int getDate() {
        return date;
    }

    public double getRateBuy() {
        return rateBuy;
    }

    public double getRateCross() {
        return rateCross;
    }

    public double getRateSell() {
        return rateSell;
    }
}
