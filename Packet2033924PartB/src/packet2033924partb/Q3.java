/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet2033924partb;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author xingyu hu
 */
public class Q3 {

    private static DataAccess dataAccess = new DataAccess();
    
    /**
    * Generate menu
    */ 
    private static Integer printMenu() {
        System.out.println("*****\tOperation Menu\t******");
        System.out.println("1: add a student.");
        System.out.println("2: add a course.");
        System.out.println("3: add a teacher.");
        System.out.println("4: add a grade.");
        System.out.println("5: list all student.");
        System.out.println("6: list all course.");
        System.out.println("7: list all teacher.");
        System.out.println("8: list all grade.");
        System.out.println("9: search a student.");
        System.out.println("10: search a course.");
        System.out.println("11: search a teacher.");
        System.out.println("12: search a grade.");
        System.out.println("0: exit the program.");
        return getNum("Please input a number to run the program:");
    }
    
    /**
    * Input number
    */ 
    private static Integer getNum(String text) {
        while (true) {
            Scanner kb = new Scanner(System.in);
            System.out.print(text);
            Integer num = null;
            try {
                num = kb.nextInt();
            } catch (Exception e) {
            }
            if (num == null) {
                System.out.println("Please enter a number between 0 and 12!!");
                continue;
            }
            return num;
        }
    }
    
    /**
     * Operate different action
     */
    public static void userInput() throws Exception {    
        while (true) {
            Integer i = printMenu();
            if (i == null || i < 0 || i > 12) {
                System.out.println("Please enter a number\n");
            }
            if (i == 0) {
                break;
            }
            switch (i) {
                case 1 -> addStudent();
                case 2 -> addCourse();
                case 3 -> addTeacher();
                case 4 -> addGrade();
                case 5 -> listStudents();
                case 6 -> listCourses();
                case 7 -> listTeachers();
                case 8 -> listGrades();
                case 9 -> searchStudent();
                case 10 -> searchCourse();
                case 11 -> searchTeacher();
                case 12 -> searchGrade();
                default -> {
                }
            }
        }
        System.out.println("Have a nice day!!!");
        }
    
    /**
    * Add student
    */ 
    private static void addStudent() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please input student information (input `-1`) to end:");
            int id = getNum("input student Id :");
            if (id == -1) {
                break;
            }
            System.out.print("input student name :");
            String name = input.nextLine();
            String gender;
            while (true) {
                System.out.print("input student gender (M/F) :");
                gender = input.nextLine();
                if ("M".equals(gender.trim()) || "F".equals(gender.trim())) {
                    break;
                }
                System.out.println(gender);
                System.out.println("Please input M or F !!!");
            }
            Student student = new Student();
            student.setStuId(id);
            student.setName(name);
            if ("M".equals(gender)) {
                student.setGender(Gender.MALE);
            } else {
                student.setGender(Gender.FEMALE);
            }
            try {
                dataAccess.saveStudent(student);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("press any key to continue....");

    }

    /**
    * Add course
    */ 
    private static void addCourse() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please input course information (input `-1`) to end:");
            int id = getNum("input course Id :");
            if (id == -1) {
                break;
            }
            System.out.print("input courseName name :");
            String name = input.nextLine();
            Course course = new Course();
            course.setCourseId(id);
            course.setCourseName(name);
            try {
                dataAccess.saveCourse(course);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("press any key to continue....");
    }

    /**
     * Add teacher
     */
    private static void addTeacher() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please input teacher information (input `-1`) to end:");
            int id = getNum("input teacher Id :");
            if (id == -1) {
                break;
            }
            System.out.print("input teacher name :");
            String name = input.nextLine();
            String gender;
            while (true) {
                System.out.print("input teacher gender (M/F) :");
                gender = input.nextLine();
                if ("M".equals(gender.trim()) || "F".equals(gender.trim())) {
                    break;
                }
                System.out.println(gender);
                System.out.println("Please input M or F !!!");
            }
            System.out.print("input teacher password :");
            String password = input.nextLine();
            Teacher teacher = new Teacher();
            teacher.setTeacherId(id);
            teacher.setName(name);
            if ("M".equals(gender)) {
                teacher.setGender(Gender.MALE);
            } else {
                teacher.setGender(Gender.FEMALE);
            }
            teacher.setPassword(password);
            try {
                dataAccess.saveTeacher(teacher);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("press any key to continue....");
    }

    /**
     * Add grade
     */
    private static void addGrade() {
        while (true) {
            System.out.println("Please input grade information (input `-1`) to end:");
            int stuId = getNum("input grade student Id :");
            if (stuId == -1) {
                break;
            }
            int couId = getNum("input grade course id :");
            System.out.print("input grade :");
            int gradeNum = getNum("input grade:");

            Grade grade = new Grade();
            grade.setStuId(stuId);
            grade.setCourseId(couId);
            grade.setGrade(gradeNum);
            try {
                dataAccess.saveGrade(grade);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("press any key to continue....");
    }

    /**
     * List students
     */
    private static void listStudents() {
        List<Student> studentList = dataAccess.getStudentList();
        if (studentList.isEmpty()) {
            System.out.println("There is NO student");
        } else {
            System.out.println(studentList);
        }
        System.out.println("press any key to continue....");
    }
    
    /**
    * List courses
    */
    private static void listCourses() {
        List<Course> courseList = dataAccess.getCourseList();
        if (courseList.isEmpty()) {
            System.out.println("There is NO course");
        } else {
            System.out.println(courseList);
        }
        System.out.println("press any key to continue....");
    }

    /**
    * List teachers
    */ 
    private static void listTeachers() {
        List<Teacher> teacherList = dataAccess.getTeacherList();
        if (teacherList.isEmpty()) {
            System.out.println("There is NO teacher");
        } else {
            System.out.println(teacherList);
        }
        System.out.println("press any key to continue....");

    }

    /**
    * List grades
    */ 
    private static void listGrades() {
        List<Grade> gradeList = dataAccess.getGradeList();
        if (gradeList.isEmpty()) {
            System.out.println("There is NO grade");
        } else {
            System.out.println(gradeList);
        }
        System.out.println("press any key to continue....");

    }
    
    /**
    * Search students
    */
    private static void searchStudent() throws Exception {
        int id = getNum("Input student Id for search:");
        Student student = dataAccess.getStudentById(id);
        if (student == null) {
            System.out.println("NO student found!");
        } else {
            System.out.println("the student information is " + student);
        }
        System.out.println("press any key to continue....");
    }
    
    /**
    * Search course
    */ 
    private static void searchCourse() throws Exception {
        int id = getNum("Input course Id for search:");
        Course course = dataAccess.getCourseById(id);
        if (course == null) {
            System.out.println("no course found!");
        } else {
            System.out.println("the course information is " + course);
        }

        System.out.println("press any key to continue....");
    }
    
    /**
    * Search teacher
    */ 
    private static void searchTeacher() throws Exception {
        int id = getNum("Input teacher Id for search:");
        Teacher teacher = dataAccess.getTeacherById(id);
        if (teacher == null) {
            System.out.println("no teacher found!");
        } else {
            System.out.println("the teacher information is " + teacher);
        }
        System.out.println("press any key to continue....");
    }
    
    /**
    * Search grade
    */ 
    private static void searchGrade() throws Exception {
        int couId = getNum("Input course Id for search:");
        int stuId = getNum("Input student Id for search:");
        Grade grade = dataAccess.getGradeById(couId,stuId);
        if (grade == null) {
            System.out.println("no grade found!");
        } else {
            System.out.println("the grade information is :" + grade);
        }
        System.out.println("press any key to continue....");
    }
    
    public static void main(String[] args) throws Exception {
         userInput();
    }
    
}
