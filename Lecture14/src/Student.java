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
    private int id;
    private int age;
    private String name;
    public Student(int id,int age, String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return "Stu Id="+id+" , Age="+age+", Name="+name;
    }
    public boolean equals(Student s){
        if (this.id==s.id && this.age==s.age && this.name.equals(s.name))
            return true;
        else
            return false;
    }
   
}
