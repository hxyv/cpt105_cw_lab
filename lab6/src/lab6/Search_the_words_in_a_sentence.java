/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class Search_the_words_in_a_sentence {
    public static void main(String[] args) {
        String input = inputSentence(); 
        searchWords(input);
        getDuplicateWords(input);
       
    }
    
    public static String inputSentence() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String input = kb.nextLine();
        return input;
    }
    
    public static void searchWords(String sentence) {
        //input the word for searching
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a word to search: ");
        String word = kb.nextLine();
        
        //search the word
        String[] blocks = sentence.split(" ");
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].toLowerCase().equals(word.toLowerCase())) {
                System.out.println("The " + word + " has been searched: " + blocks[i]);
            }
        }
    }
    
    public static void getDuplicateWords(String str) {
    String[] blocks = str.split(" ");
    String storage = "";
    for (int i = 0; i < blocks.length; i++) {
        for (int j = 0; j < blocks.length; j++) {
            if (j == i) {
            } else {
                if (blocks[i].equals(blocks[j])) {
                    storage = blocks[i];
                }
            }
        }
        if (!storage.isEmpty()) {
            System.out.println(storage);
            storage = null;
        
           
        }
    }
    }
}
