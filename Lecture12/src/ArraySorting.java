/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class ArraySorting {
    //sort the array form max to min
    public static void sortMaxMin(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if (a[i]<a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    public static void sortMinMax(int[] a){
        //complete this method by yourself
    }
    public static void main(String[] agrs){
        int[] a=new int[]{1,5,8,10,12,9};
        sortMaxMin(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
