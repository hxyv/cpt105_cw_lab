
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
public class StudentArrayListTest {
    public static void main(String[] args){
        ArrayList<Student> lst=new ArrayList();
        lst.add(new Student(1,21,"John"));
        lst.add(new Student(2,22,"Henry"));
        lst.add(new Student(3,23,"Mike"));
        System.out.println(lst);
        
        System.out.println("try to remove an object....");
        Student s1=new Student(2,21,"Henry");
        for( Student s: lst){
           if(s==s1){ 
           //if(s.equals(s1)){
               lst.remove(s1);
               //lst.remove(s);
           } 
        }
        System.out.println(lst);
        
    }
}
