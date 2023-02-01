
import java.io.*;
import java.util.*;

public class ObjectFileTest {

    private static final String fileName = "StudentFile.txt";

    public static void writeObjToFile(Object p) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void appendObjToFile(Object p) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            oos.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void readObjFromFile() {
        try {
            Object obj = null;
            ObjectInputStream ois = null;
            FileInputStream fis = new FileInputStream(fileName);
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                obj = ois.readObject();
                System.out.println(obj);
            }
            ois.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void printMenu() {
        System.out.println("1: Add a student");
        System.out.println("2: List all students");
        System.out.println("0: Quit the program");
    }

    public static void addStudent() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input student name: ");
        String name = scan.nextLine();
        System.out.print("Input student gender(M/F): ");
        String gender = scan.nextLine();
        System.out.print("Input student age: ");
        int age = Integer.parseInt(scan.nextLine());
        Student s = new Student(name, gender, age);
        appendObjToFile(s);
    }

    public static void userInput() {
        printMenu();
        System.out.print("Please input a number:");
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        switch (i) {
            case 1:
                addStudent();
                break;
            case 2:
                readObjFromFile();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Input error and try again!");
        }
    }

    public static void main(String[] args) {
        while (true) {
            userInput();
        }
    }

}
