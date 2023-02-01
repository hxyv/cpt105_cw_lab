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
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StockPrice sp1 = new StockPrice("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        StockPrice sp2 = new StockPricePlus("AAPL", "2006-12-4", 91.88, 92.05, 90.5, 91.12, 25340600);
        StockPricePlus sp3 = new StockPricePlus("AAPL", "2006-12-5", 91.655, 92.33, 90.87, 91.27, 23672800);

        StockPrice[] spArray = new StockPrice[3];
        spArray[0] = sp1;
        spArray[1] = sp2;
        spArray[2] = sp3;

        System.out.println(sp1);
        System.out.println(sp2);
        System.out.println(sp3);
        sp3.getTotalNumOfQuery();

        StockPrice spmax = getHighestIncreasedPrice(spArray);
        System.out.println("The highest increase is: " + spmax.getTicker() + " on " + spmax.getDate());
        printStockPricePlusObject(spArray);
    }

    private static StockPrice getHighestIncreasedPrice(StockPrice sp[]) {
        int index = 0;
        double max = sp[0].increasedPrice();
        for (int i = 1; i < sp.length; i++) {
            if (max < sp[i].increasedPrice()) {
                max = sp[i].increasedPrice();
                index = i;
            }
        }
        return sp[index];
    }

    private static void printStockPricePlusObject(StockPrice[] sp) {
        for (int i = 0; i < sp.length; i++) {
            if (sp[i] instanceof StockPricePlus) {
                System.out.println(sp[i]);
            }
        }
    }
}
