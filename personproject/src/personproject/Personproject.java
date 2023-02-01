/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personproject;


/**
 *
 * @author xingyu hu
 */
public class Personproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1;
        p1 = new Person("James Bond", "M", "London", "1921-11-11", 007);
        Person p2;
        p2 = new Person("Jackie Chan", "M", "Hong Kong", "1954-4-7", 1);
        Person p3 = new Person("James Bond", "M", "London", "1921-11-11", 007);
        
        Student s1 = new Student("A Student", "M", "Suzhou", "1954-4-7", 2033924, 2, "Bio");
        
        People pe1 = new People("A Student", "M", "Suzhou", "1954-4-7", 20334,3, "Bio");
        System.out.println(pe1.toString());
        
        System.out.println("Name = " + p1.getName());
        
        Person[] people = new Person[2];
        people[0] = p1;
        people[1] = p2;
        System.out.println("Equals? " + p1.equals(p2));
        System.out.println("Equals? " + p1.equals(p3));
        
        System.out.println("p1 = " + p1.toString());
        
        System.out.println("Name is " + s1.getName());
        System.out.println("Major is " + s1.getMajor());
        System.out.println(s1.toString());
        System.out.println(p1.toString());
    }
    
}
