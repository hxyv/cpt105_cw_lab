/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11_practice;
import java.io.*;
import java.util.*;
/**
 *
 * @author xingyu hu
 */
public class ObjectFileOperation {
    public static void writeObjToFile(Object p, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public static void appendObjToFile(Object p, String fileName){
        try {
            FileOutputStream fos = new FileOutputStream(fileName, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public static void readObjFromFile(String fileName) {
        try {
            Object obj = null;
            ObjectInputStream ois = null;
            FileInputStream fis = new FileInputStream(fileName);
            while(fis.available() > 0){
                ois = new ObjectInputStream(fis);
                obj = ois.readObject();
                System.out.println(obj);
            }
            ois.close();
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public static void main(String[] argc) {
        Person p1 = new Person("John",20);
        Person p2 = new Person("Marry", 19);
        String fileName = "objdata.txt";
        writeObjToFile(p1,fileName);
        appendObjToFile(p1, fileName);
        appendObjToFile(p2,fileName);
        readObjFromFile(fileName);
    }
}
