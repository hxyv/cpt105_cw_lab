/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_8;

/**
 *
 * @author xingyu hu
 */
public class Lecture_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        
    }
    
}

class Animal {
    public void move() {
        System.out.println("Animals can move.");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can run and walk.");
    }
}

