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
public class Grade implements Serializable {

    private static final long serialVersionUID = 8735132092273200831L;
    
    // Instance variables
    private int stuId;
    private int courseId;
    private int grade;
    
    // Nullary constructor
    public Grade(){}
    
    // Constructor
    public Grade(int stuId, int courseId, int grade) {
        // assign varibles
        this.stuId = stuId;
        this.courseId = courseId;
        this.grade = grade;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    @Override
    public String toString(){
        return "Student ID: " + stuId
                + ", Course ID: " +  courseId
                + ", Grade: " + grade;
    }
}
