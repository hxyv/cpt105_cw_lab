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
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StockPrice sp1 = new StockPrice("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        StockPrice sp2 = new StockPrice("AAPL", "2006-12-4", 91.88, 92.05, 90.5, 91.12, 25340600);
        StockPrice sp3 = new StockPrice("AAPL", "2006-12-5", 91.655, 92.33, 90.87, 91.27, 23672800);
        StockPrice spDefault = new StockPrice("","",0,0,0,0,0);
        
        System.out.println(sp1.spSpead());
        
        StockPrice[] stock = new StockPrice[3];
        stock[0] = sp1;
        stock[1] = sp2;
        stock[2] = sp3;
        
        for (int i = 0; i < stock.length; i++) {
            stock[i].Viewer();
        }
        
        System.out.println(sp1.toString());
        
        lowestPrice(stock);
        
        printAllStocks(stock);
        
        sp2.comparingClosingPrice(sp1);
        
    }
    public static void lowestPrice(StockPrice[] stock) {
        double lowestPrice = stock[0].Open;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i].Open <= lowestPrice) {
                lowestPrice = stock[i].Open;
            }
        }
        System.out.println("Lowest opening price is: " + lowestPrice);
    }

    public static void printAllStocks(StockPrice[] stock) {
        for (int i = 0; i < stock.length; i++) {
            System.out.println(stock[i]);
        }
    }
}
