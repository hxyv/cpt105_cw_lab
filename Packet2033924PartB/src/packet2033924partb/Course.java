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
public class Course implements Serializable {
    
    private static final long serialVersionUID = 8735132092273200831L;
    
    // Instance variables
    private int courseId;
    private String courseName;
    
    // Nullary constructor
    public Course(){}
    
    // Constructor
    public Course(int courseId, String courseName){
        // assign varibles
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    public int getCourseId(){
        return courseId;
    }
    
    public void setCourseId(int courseId){
        this.courseId = courseId;
    }
    
    public String getCourseName(){
        return courseName;
    }
   
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    @Override
    public String toString(){
        return "Course ID: " + courseId 
                + ", Course Name: " + courseName;
    }
    
}
