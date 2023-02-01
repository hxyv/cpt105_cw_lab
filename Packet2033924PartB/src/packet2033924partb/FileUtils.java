/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924partb;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xingyu hu
 */
public class FileUtils {
    
    /**
     * Save a student
     */
    public static void saveStudent(Student student) {
        List<Student> studentList = new ArrayList<>();
        try {
            studentList = getStudentList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        studentList.add(student);
        try{
            ObjectOutputStream os = new ObjectOutputStream (
                    new FileOutputStream("src/data/student.txt"));
            os.writeObject(studentList);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
    * Save a course
    */
    public static void saveCourse(Course course) {
        List<Course> courseList = new ArrayList<>();
        try {
            courseList = getCourseList();
        } catch(Exception e) {
            e.printStackTrace();
        }
        courseList.add(course);
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("src/data/course.txt"));
            os.writeObject(courseList);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
    * Save a teacher
    */
    public static void saveTeacher(Teacher teacher) {
        List<Teacher> teacherList = new ArrayList<>();
        try {
            teacherList= getTeacherList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        teacherList.add(teacher);
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("src/data/teacher.txt"));
            os.writeObject(teacherList);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
    
    /**
    * Save a grade
    */ 
    public static void saveGrade(Grade grade) {
        List<Grade> gradeList = new ArrayList<>();
        try {
            gradeList= getGradeList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        gradeList.add(grade);
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("src/data/grade.txt"));
            os.writeObject(gradeList);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
    / Get the student list
    */
    public static List<Student> getStudentList(){
        return get("src/data/student.txt");
    }
    
    /**
    * Get the course list
    */ 
    public static List<Course> getCourseList() {
        return get("src/data/course.txt");
    }
    
    /**
    * Get the teacher list
    */ 
    public static List<Teacher> getTeacherList() {
        return get("src/data/teacher.txt");
    }
    
    /**
    * Get the grade list
    */ 
    public static List<Grade> getGradeList() {
        return get("src/data/grade.txt");
    }
    
    /**
    * Get data from a certain file
    */ 
    private static <T> List<T> get(String fileName) {
        ArrayList<T> list = new ArrayList();
        try {
            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream(fileName));
            list = (ArrayList<T>) is.readObject();
        } catch (Exception e) {
        }
        return list;
    }
}
