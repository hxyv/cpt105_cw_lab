/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11_practice;

/**
 *
 * @author xingyu hu
 */
import java.nio.file.*;
import java.io.*;

public class Lecture11_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        readFile_1("D:\\test.txt");
        writeFile_1("D:\\test.txt");
        appendFile_1("D:\\test.txt");
        
       try {
            writeFile_2("D:\\test.txt");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        
        try {
            readFile_2("D:\\test.txt");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public static void readFile_1(String fileName) {
        String str = "";
        try{
            Path path = Paths.get(fileName);
            BufferedReader reader = Files.newBufferedReader(path);
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
        }
            reader.close();
        }
        catch (Exception e) {
            System.out.println("file reading error!" + e.toString());
        }
    }
    
    public static void readFile_2(String fileName) throws Exception {
        String str = "";
        File f = new File(fileName);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
    
    public static void writeFile_1(String fileName) {
        String str = "this is a writing file test\r"
                + "Hello everyone \r"
                + "welcome to java programing";
        try {
            Path path = Paths.get(fileName);
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write(str);
            writer.close();
        }
        catch (Exception e){
                System.out.println("file writing error!" + e.toString());
        }
        }
    
    public static void writeFile_2(String fileName) throws Exception {
        String str = "This is a writing file test \r"
                + "Hello everyone \r" 
                + "welcome to java programing";
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.close();
    }
    
    public static void appendFile_1(String fileName){
        String str = "This is a writing file test\r"
                + "Hello everyone \r"
                + "welcome to java programming";
        try {
            Path path = Paths.get(fileName);
            BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
            writer.write(str);
            writer.close();
        }
        catch (Exception e) {
            System.out.println("file writing error!" + e.toString());
        }
    }
    
    public static void appendFile_2(String fileName) throws Exception{
        String str = "This is a writing file\t"
                + "Hello everyone \r"
                + "welcome to java programming";
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.close();
    }
    
    
}
