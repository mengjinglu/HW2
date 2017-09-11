
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
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter some words seperated by comma.");
        Scanner line = new Scanner(System.in);
        String x = line.nextLine();
    Scanner input = new Scanner(x);
    
    input.useDelimiter(",");
    while(input.hasNext()){
        System.out.println(input.next());
    }
    
    input.close();
    }
    
}
