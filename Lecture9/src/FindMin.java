/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class FindMin {
    private static int findMin(int[] numbers) throws FindMinException{
        if(numbers.length>0){
            int minSoFar=numbers[0];
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]<minSoFar){
                    minSoFar=numbers[i];
                }
            }
            return minSoFar;
        }
        else{
            throw (new FindMinException());
        }
    }
    public static void main(String[] args){
        int[] numbers;
        numbers=new int[0];
        try{
        findMin(numbers);
        }
        catch(FindMinException e){
        //catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
