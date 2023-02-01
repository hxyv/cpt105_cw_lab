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
public class People extends Person{
        private final String major;
        private final int yearOfStudy;
        
        public People (String name, String gender, String city, String Dob, int id, int yearOS, String maj) {
        // calls superclass constructor
        super(name, gender, city, Dob, id);
        // assign varibles
        this.major = maj;
        this.yearOfStudy = yearOS;
        }
        public String toString(){
             return "Student: name = " + this.getName() + ", gender = " + this.getGender() + ", city = " + this.getCity() + ", date of birth = " + this.getDateOfBirth() + ", idnumber = " + this.getIdNumber() + ", \n \t major: " + major + ", year of study: " + yearOfStudy;
        }
        
}
