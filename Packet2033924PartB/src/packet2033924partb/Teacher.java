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
public class Teacher extends Person implements Serializable {

    private static final long serialVersionUID = 8735132092273200831L;
    
    // Instance variables
    private int teacherId;
    private String loginName;
    private String password;
    
    // Nullary constructor
    public Teacher(){}
    
    // Constructor
    public Teacher(String name, Gender gender, int teacherId, String loginName, String password) {
        // calls superclass constructor
        super(name, gender);
        // assign varibles
        this.teacherId = teacherId;
        this.loginName = loginName;
        this.password = password;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher name: " + getName()
                + ", Teacher gender: " + getGender()
                + ", Teacher ID: " + teacherId
                + ", Teacher login name: " + loginName
                + ", Teacher password: " + password;
    }
}
