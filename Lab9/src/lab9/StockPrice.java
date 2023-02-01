/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author ping
 */
public class StockPrice {

    private String ticker;
    private String date;
    private double open;
    private double high;
    private double low;
    private double close;
    private int volume;

    public StockPrice() {
        ticker = "Unknown";
        date = "2001-11-11";
        open = 100;
        high = 101;
        low = 93;
        close = 99;
        volume = 9999;
        System.out.println("Stock " + this.ticker + " " + this.date + " created.");
    }

    public StockPrice(String ticker, String date, double open, double high, double low, double close, int volume) {
        this.ticker = ticker;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        System.out.println("Stock " + this.ticker + " " + this.date + " created.");
    }

    public String getTicker() {
        return ticker;
    }

    public String getDate() {
        return date;
    }

    public double getOpen() {
        return open;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getClose() {
        return close;
    }

    public int getVolume() {
        return volume;
    }

    public double spread() {
        return high - low;
    }

    public void comparingClosingPrice(StockPrice that) {
        if (!this.ticker.equals(that.getTicker())) {
            System.out.println("Cannot compare different stock");
        } else if (this.date.equals(that.getDate())) {
            System.out.println("Cannot compare the stock for same date");
        } else if (this.close > that.getClose()) {
            System.out.println(this.ticker + "\'s closing price in " + this.date + " is higher than that in " + that.getDate());
        } else if (this.close < that.getClose()) {
            System.out.println(this.ticker + "\'s closing price in " + this.date + " is lower than that in " + that.getDate());
        } else {
            System.out.println(this.ticker + "\'s closing price in " + this.date + " is same as that in " + that.getDate());
        }
    }

    @Override
    public String toString() {
        return "The opening price of " + this.ticker + " on " + this.date + " was " + this.open
                + ". The highest price was " + this.high + " and lowest price was " + this.low + ". The closing price was " + this.close + ".";
    }
    
    public double increasedPrice() {
        double increase = close - open;
        return increase;
    }

}
