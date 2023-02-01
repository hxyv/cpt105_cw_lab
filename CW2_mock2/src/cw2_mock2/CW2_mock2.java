/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2_mock2;

/**
 *
 * @author xingyu hu
 */
public class CW2_mock2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*        int capacity = 80;
        double percentage = 2;
        double cap = capacity;
        capacity = (int)Math.ceil(cap * ( 1 + percentage / 100));
        System.out.println(capacity);
        /*
        if (this.capacity > other.capacity) {
            return true;
        } else {
            return false;
        }
        */
        /*
        super(location, capacity);
        this.numOfComp = numOfComp;
        */
        /*
        super.enlarge(percantage);
        double num = numOfComp;
        double percent = getPercentage();
        numOfComp = (int)Math.ceil(num * ( 1 + percent / 100));
        */
        
        System.out.println(concatContain("abc", "bcaabc"));
        //char ab = 'a';
        //String as = Character.toString(ab);
    }
    
    public static int concatContain(String source, String target) {
        int counter = 0;
        
        for (int i = 0; i < target.length(); i++) {
            if (!source.contains(target.substring(i,i+1))) {
                counter = -1;
                break;
            }
        }
        
        if (counter == 0) {
        String concat = "";
        while (counter >= 0){
            concat += source;
            if (concat.contains(target)) {
                break;
            }
            counter++;
        }
        }
        return counter;
    }
    
}
