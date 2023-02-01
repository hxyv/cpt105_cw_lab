
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class ArrayListTest {
    public static void add(ArrayList<String> lst){
        lst.add("Chris");
        lst.add("George");
        lst.add("Henry");
        lst.add("Margaret");
        lst.add("Fred");
    }
    public static void addAt(ArrayList<String> lst, String s, int i){
        if (i<0 || i>lst.size())
            System.out.println("index is out of bound of ArrayList");
        else
            lst.add(i,s);
    }   
    public static String getAt(ArrayList<String> lst,int i){
        if (i<0 || i>lst.size()){
            System.out.println("index is out of bound of ArrayList"); 
            return null;         
        }
        else
            return lst.get(i);
    }
    public static boolean search(ArrayList<String> lst, String s){
        for(int i=0;i<lst.size();i++){
            if(lst.get(i).equals(s))
                return true;
        }
        return false;
    }
    public static void removeAt(ArrayList<String> lst, int i){
        if(i<lst.size())
            lst.remove(i);
        else
            System.out.println("index i is out of the bound of ArrayList!");
    }
    public static void print(ArrayList<String> lst){
        for(int i=0;i<lst.size();i++){
            System.out.println(lst.get(i));
        }
    }
    public static void sort(ArrayList<String> lst){
        Collections.sort(lst);
    }
    public static void sortDesc(ArrayList<String> lst){
        Collections.sort(lst, Collections.reverseOrder());
    }
    public static void main(String[] args){
        ArrayList<String> lstName=new ArrayList<String>();
        add(lstName);
        print(lstName);
        addAt(lstName,"insert string",5);
        sortDesc(lstName);
        print(lstName);
    }
}
