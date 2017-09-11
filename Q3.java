
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mengjinglu
 */
public class Q3 {
    public static void main(String[] args) {
    
    System.out.println("Enter a word");
        StringBuilder word = new StringBuilder(new Scanner(System.in).nextLine());
        if(word.toString().equals(word.reverse().toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    
    
    }
}
