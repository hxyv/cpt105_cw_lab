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
public class Student extends Person{
    private final String major;
    private final int yearOfStudy;
    
// Constructor
    public Student(String name, String gender, String city, String Dob, int id,int yearOS, String maj) {
        // calls superclass constructor
        super(name, gender, city, Dob, id);
        // assign varibles
        this.major = maj;
        this.yearOfStudy = yearOS;
    }
    
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    
    public String getMajor() {
        return major;
    }
    
    public String toString() {
        return "Student: name = " + this.getName() + ", gender = " + this.getGender() + ", city = " + this.getCity() + ", date of birth = " + this.getDateOfBirth() + ", idnumber = " + this.getIdNumber() + ", \n \t major: " + major + ", year of study: " + yearOfStudy;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } 
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!this.getGender().equals(other.getGender())) {
            return false;
        }
        if (!this.getCity().equals(other.getCity())) {
            return false;
        }
        if (!this.getDateOfBirth().equals(other.getDateOfBirth())) {
            return false;
        }
        if (this.getIdNumber() != other.getIdNumber()) {
            return false;
        }
        if (this.getMajor() != other.getMajor()) {
            return false;
        }
        if (this.getYearOfStudy() != other.getYearOfStudy()) {
            return false;
        }
            return true;
    }
}
