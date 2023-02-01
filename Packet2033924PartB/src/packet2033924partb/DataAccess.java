/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924partb;
import java.util.List;
/**
 *
 * @author xingyu hu
 */
public class DataAccess {
    /**
    * Get the student list
    */ 
    public List<Student> getStudentList(){
        return FileUtils.getStudentList();
    }
    
    /**
    * Get the course list
    */ 
    public List<Course> getCourseList() {
        return FileUtils.getCourseList();
    }
    
    /**
    * Get the teacher list
    */ 
    public List<Teacher> getTeacherList(){
        List<Teacher> teaList = FileUtils.getTeacherList();
        for(Teacher teacher : teaList) {
            try {
                teacher.setPassword(Encryption.decrypt(teacher.getPassword()));
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return teaList;
    }
    
    /**
    * Get the grade list
    */ 
    public List<Grade> getGradeList() {
        return FileUtils.getGradeList();
    }
    
    /**
    * Search for student by id
    */ 
    public Student getStudentById(String id) throws Exception {
        if (!isNumeric(id)) {
            throw new Exception("Not numeric");
        } else {
            int idInt = Integer.valueOf(id);
            List<Student> stuList = FileUtils.getStudentList();
            for (Student student : stuList) {
                if (student.getStuId() == idInt) {
                    return student;
                }
            }
        }
        return null;
    }  
    
    public Student getStudentById(int id) throws Exception{
        return getStudentById(String.valueOf(id));
    }
    
    /**
    * Search for course by id
    */ 
    public Course getCourseById(String id) throws Exception {
        if (!isNumeric(id)) {
            throw new Exception("Not numeric");
        } else {
            int idInt = Integer.valueOf(id);
            List<Course> couList = FileUtils.getCourseList();
            for (Course course : couList) {
                if (course.getCourseId() == idInt) {
                    return course;
                }
            }
        }
        return null;
    }
    
    public Course getCourseById(int id) throws Exception {
        return getCourseById(String.valueOf(id));
    }
    
    /**
    * Search for teacher by id
    */ 
    public Teacher getTeacherById(String id) throws Exception {
        if (!isNumeric(id)) {
            throw new Exception("Not numeric");
        } else {
            int idInt = Integer.valueOf(id);
            List<Teacher> teaList = FileUtils.getTeacherList();
            for (Teacher teacher : teaList) {
                if (teacher.getTeacherId() == idInt) {
                    return teacher;
                }
            }
        }
        return null;
    }
    
    public Teacher getTeacherById(int id) throws Exception {
        return getTeacherById(String.valueOf(id));
    }
    
    /**
    * Search for grade by id
    */ 
    public Grade getGradeById(String couId, String stuId) throws Exception {
        if (!isNumeric(couId) && !isNumeric(stuId)) {
            throw new Exception("Not numeric");
        } else {
            int couIdInt = Integer.valueOf(couId);
            int stuIdInt = Integer.valueOf(stuId);
            List<Grade> graList = FileUtils.getGradeList();
            for (Grade grade : graList) {
                if (grade.getCourseId() == couIdInt && grade.getStuId() == stuIdInt) {
                    return grade;
                }
            }
            return null;
        }
    }
        
    /**
     *
     * @param couId
     * @param stuId
     * @return
     * @throws Exception
     */
    public Grade getGradeById(int couId, int stuId) throws Exception {
        return getGradeById(String.valueOf(couId), String.valueOf(stuId));
    }
    
    /**
    * Save a student
    */ 
    public void saveStudent(Student student) throws Exception {
        if (getStudentById(student.getStuId()) != null) {
            throw new IllegalArgumentException("Duplicate Id Exists!");
        }
        FileUtils.saveStudent(student);
    }
    
    /**
    * Save a course
    */ 
    public void saveCourse(Course course) throws Exception {
        if (getCourseById(course.getCourseId()) != null) {
            throw new IllegalArgumentException("Duplicate Id Exists!");
        }
        FileUtils.saveCourse(course);
    }
    
    /**
    * Save a teacher
    */ 
    public void saveTeacher(Teacher teacher) throws Exception {
        if (getTeacherById(teacher.getTeacherId()) != null) {
            throw new IllegalArgumentException("Duplicate Id Exists!");
        }
        teacher.setPassword(Encryption.encrypt(teacher.getPassword()));
        FileUtils.saveTeacher(teacher);
    }
    
    /**
    * Save a grade
    */ 
    public void saveGrade(Grade grade) throws Exception{
        if (getStudentById(grade.getStuId()) != null && getCourseById(grade.getCourseId()) != null) {
            throw new IllegalArgumentException("Duplicate Id Exists!");
        }
        if (getStudentById(grade.getStuId()) == null) {
            throw new IllegalArgumentException("This student DOES NOT exist!");
        }
        if (getCourseById(grade.getCourseId()) == null) {
            throw new IllegalArgumentException("This course DOES NOT exist!");
        }
        FileUtils.saveGrade(grade);
    }
    
    /**
     * determine whether the input string is numeric
     * @param str
     * @return 
     */
    public static boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0;) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
