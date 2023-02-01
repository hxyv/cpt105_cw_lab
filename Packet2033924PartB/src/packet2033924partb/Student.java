/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924partb;
import java.io.Serializable;
/**
 *
 * @author xingyu hu
 */
public class Student extends Person implements Serializable{
    
    private static final long serialVersionUID = 8735132092273200831L;
    
    // Instance variable
    private int stuId;
    
    // Nullary constructor
    public Student(){}
    
    // Constructor
    public Student(String name, Gender gender, int stuId) {
        // calls superclass constructor
        super(name,gender);
        // assign varibles
        this.stuId = stuId;
    }
   
    public int getStuId(){
        return stuId;
    }
    
    public void setStuId(int stuId){
        this.stuId = stuId;
    }
    
    @Override
    public String toString(){
        return "Student name: " + getName() 
                + ", Student gender: " + getGender()
                + ", Student ID: " + stuId;
    }
    
}
