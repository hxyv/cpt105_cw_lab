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
public class Person implements Serializable{
    
    private static final long serialVersionUID = 8735132092273200831L;
    
    /**
    * Instance variables
    */ 
    private String name;
    private Gender gender;
    
    /**
    * Nullary constructor
    */ 
    public Person(){}
    
    /**
    * Constructor
    */ 
    public Person(String name, Gender gender){
        // assign varibles
        this.name = name;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Gender getGender(){
        return gender;
    }
    
    public void setGender(Gender gender){
        this.gender = gender;
    }
    
    /**
     *
     * @return
     */
    public String toStirng(){
        return "Person name: " + name
                + ", Person gender: " + gender; 
    }
}
