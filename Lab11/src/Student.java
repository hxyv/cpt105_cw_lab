
import java.io.*;


public class Student implements Serializable {
    // Instance variables
    private String name;
    private int age;
    private String gender ;

// Constructor
    public Student(String name, String gender, int age) {
        // assign variables
        this.name = name;
        this.gender =gender;
        this.age = age;

    }
    // Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return "Student: namer= " + name + " , age= " + age +
                " , gender= " + gender;
    }

}
