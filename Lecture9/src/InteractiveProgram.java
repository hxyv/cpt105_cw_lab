
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */

public class InteractiveProgram {
    public static void printMenu(){
        System.out.println("Please select your action:");
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. Search a student");
        System.out.println("4. List all students");
        System.out.println("0. Quit the program");
    }
    public static void process(StudentOperation op){
        Scanner userInput=new Scanner(System.in);
        int userChoice=Integer.parseInt(userInput.nextLine());
        if (userChoice==1){
            // add a student
            op.addStudent();
        } else if (userChoice==2){
            // remove a student
            op.removeStudent();
        } else if (userChoice==3){
            // search a student
            Student stu=op.searchStudent();
            if (stu!=null)
                System.out.println(stu);
            else
                System.out.println("No student found.");
        } else if (userChoice==4){
            // list all students
            op.listAllStudents();
        } else if (userChoice==0){
            // quit the program
            System.exit(0);
        } else{
            //Input error
            System.out.println("Please input an int between 0 and 4!");
        } 
        switch (userChoice){
            case 1:
                //add a student
                break;
            case 2:
                //remove a student
                break;
            case 3:
                // search a student
            case 4:
                //list all students
            case 5:
                // quit the program
            default:
                // error
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        StudentOperation op=new StudentOperation(10);             
        while(true){
            printMenu(); 
            process(op);
        }
    }
}
