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
public class Person {
    private String name;
    private String gender;
    private String city;
    private String dateOfBirth;
    private int idNumber;
    
    //constructor
    public Person(String name, String gender, String city, String DoB, int id) {
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.dateOfBirth = DoB;
        this.idNumber = id;

    }
    
    public String getName() {
        return name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public int getIdNumber() {
        return idNumber ;
    }
    
    public boolean equals(Person other) {
        if (!this.name.equals(other.getName())) {
            return false;
        }
        if(!this.gender.equals(other.getGender())) {
            return false;
        }
        if(!this.dateOfBirth.equals(other.getDateOfBirth())) {
            return false;
        }
        if(this.idNumber != other.getIdNumber()) {
            return false;
        }
        return true;
    }
    
    public String toString() {
        return "Person: \n\tname: " + name 
                + ", \n\tgender: " + gender 
                + ", \n\tcity: " + city
                + ", \n\tidNumber: " + idNumber;
                
    }
    
}





