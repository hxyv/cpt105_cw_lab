/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockprice_interface;
import java.util.*;
/**
 *
 * @author xingyu hu
 */
public class StockPrice_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StockPrice[] sps = new StockPrice[12];
        sps[0] = new StockPrice("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        sps[1] = new StockPrice("AAPL", "2006-12-4", 91.88, 92.05, 90.5, 91.12, 25340600);
        sps[2] = new StockPrice("AAPL", "2006-12-5", 91.655, 92.33, 90.87, 91.27, 23672800);
        sps[3] = new StockPrice("CSCO", "2006-12-11", 26.9, 27.48, 26.85, 27.11, 43035200);
        sps[4] = new StockPrice("HD ", "2006-12-6", 39.52, 40.11, 39.26, 39.92, 17948700);
        sps[5] = new StockPrice("IBM", "2006-12-6", 94.7, 94.87, 94.01, 94.12, 5947300);
        sps[6] = new StockPrice("XOM", "2006-12-6", 77.82, 78.2, 76.25, 76.31, 30695700);
        sps[7] = new StockPrice("AXP", "2006-12-7", 59.8, 60.05, 59.05, 59.17, 5015700);
        sps[8] = new StockPrice("XOM", "2006-12-11", 75.25, 75.84, 74.82, 75.36, 18641100);
        sps[9] = new StockPrice("AXP", "2006-12-12", 59.15, 59.25, 58.59, 59.12, 5459500);
        
        for (int i = 0; i < sps.length; i++){
            System.out.println(sps[i]);
        }
        
    }
    
}
