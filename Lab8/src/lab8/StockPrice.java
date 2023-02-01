/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author xingyu hu
 */
public class StockPrice {
    public String Ticker;
    public String Date;
    public double Open;
    public double High;
    public double Low;
    public double Close;
    public double Volume;
    
    // constructor
    public StockPrice(String ticker, String date, double open, double high, double low, double close, double volume) {
        Ticker = ticker;
        Date = date;
        Open = open;
        High = high;
        Low = low;
        Close = close;
        Volume = volume;
        System.out.println("Stock " + Ticker + " " + Date + " created.");
    }
    
    // getters
    public String getTicker() {
        return Ticker;
    }
    public String getData() {
        return Date;
    }
    public double getOpen() {
        return Open;
    }
    public double getHigh() {
        return High;
    }
    public double getLow() {
        return Low;
    }
    public double getClose() {
        return Close;
    }
    public double getVolume() {
        return Volume;
    }
    
    public double spSpead() {
        return this.High - this.Low;
    }
    
    public void Viewer() {
        System.out.println("Stockprice Ticker is " + this.Ticker);
        System.out.println("  -- Opening price is " + this.Open);
        System.out.println("  -- Closing price is " + this.Close);
    }

    
    @Override
    public String toString() {
        return "(" + Ticker + ", " + Date + ", " + Open + ", " + High + ", " + Low + ", " + Close + ", " + Volume + ")";
    }
    
    
    
    public void comparingClosingPrice(StockPrice that) {
        if (this.Close > that.Close) {
            System.out.println("AAPL's closing price in " + this.Date + " is higher than that in " + that.Date + ".");
        }
        else if (this.Close == that.Close) {
            System.out.println("AAPL's closing price in " + this.Date + " is equal to that in " + that.Date + ".");
        }
        else {
            System.out.println("AAPL's closing price in " + this.Date + " is lower to that on " + that.Date + ".");
        }
    }

}
