
import java.text.*;
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
public class DateTest {
    public static void main(String[] agrs){
        
        Date d1=new Date();
        System.out.println(d1);
        Date d2=new Date(2021, 11,25);
        System.out.println(d2);
        Date d3 =new Date(2021,11,25,10,15);
        System.out.println(d3);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        System.out.println(dateFormat.format(d1));
    }
}
