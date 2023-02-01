/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class Student {
    private String name;
    private String gender;
    private int age;
    public Student(String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public String toString(){
        return "Student name= "+ name+", gender="+gender+ ", age="+age;
    }
    public String getName(){
        return name;
    }
}
