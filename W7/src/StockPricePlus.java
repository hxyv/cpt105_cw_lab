/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class StockPricePlus extends StockPrice{
    private int amount;
    private static int totalAmount = 0;
    
// constructor
    public StockPricePlus(String ticker, String date, double open, double high, double low, double close, int volume) {
        super(ticker, date, open, high, low, close, volume);
        amount = 0;
    }
    
    public static void getTotalNumOfQuery() {
        System.out.println("Total number of queries: " + totalAmount);
    }
}
