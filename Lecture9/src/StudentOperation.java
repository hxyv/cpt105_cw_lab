
import java.util.InputMismatchException;
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
public class StudentOperation {
    private Student[] stu;
    private int stuCount=0;
    public StudentOperation(int stuCount){
        //this.stuCount=stuCount;
        stu=new Student[stuCount];
    }
    public void addStudent(){
        String name,gender;
        int age;
        Scanner scan=new Scanner(System.in);
        System.out.print("Input student's name: ");
        name=scan.nextLine();
        System.out.print("Input student's gender(M/F): ");
        gender=scan.nextLine();
        System.out.print("Input student's age: ");
        try{
            age=scan.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Input student's age error:\n "
                    + "Adding student is failed\n"
                    +e.toString());
            return;
        }
        stu[stuCount]=new Student(name,gender,age);
        stuCount++;      
    }
    public void removeStudent(){
        System.out.print("Which student you want to remove (0-"+(stu.length-1)+")?");
        Scanner scan=new Scanner(System.in);
        int index=scan.nextInt();
        stu[index]=null;
        System.out.println("Student["+index+"] is removed!");
    }
    public Student searchStudent(){       
        System.out.print("Please input the student name for search:");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        for (int i = 0; i < stu.length; i++){
            if (stu[i]!=null && stu[i].getName().equals(name))
                return stu[i];
        }
        return null;
    }
    public void listAllStudents(){
        for(int i=0;i<stu.length;i++){
            if (stu[i]!=null)
                System.out.println(stu[i]);
        }        
    }   
}
