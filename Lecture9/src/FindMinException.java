/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class FindMinException extends Exception {
    public FindMinException(){
        super();
    }
    public String toString(){
        return "Array is empty! Cannot find the minimum value!";
    }
}
