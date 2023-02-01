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
public class StockPricePlus extends StockPrice {

    private int amount;
    private static int totalAmount = 0;

    public StockPricePlus(String ticker, String date, double open, double high, double low, double close, int volume) {
        super(ticker, date, open, high, low, close, volume);
        amount = 0;
    }
    
    public void getTotalNumOfQuery() {
        System.out.println("Total number of queries: " + totalAmount);
    }

    @Override
    public String toString() {
        amount += 1;
        totalAmount += 1;
        return "Ticker= " + super.getTicker() + " , date= " + super.getDate() + ", opening price = " + super.getOpen()
                + ", closing price= " + super.getClose() + ", high=" + super.getHigh() + ", low= " + super.getLow()
                + ", volume= " + super.getVolume() + ", Queries: " + this.amount;
    }

}
