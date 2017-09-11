
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
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How tall do you want?");
                int level = input.nextInt();
                int Count = 1;
 
        System.out.println("Here is the pyramid:");
 
        for (int i = level; i > 0; i--)
        {
            for (int j = 1; j <= i*2; j++)//this will be printing the spaces before the number
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= Count; j++)// this will be printing from 1 to the middle number             
            {
                System.out.print(j+" ");
            }
 
             
            for (int j = Count-1; j >= 1; j--)//this will be printing from middle number to 1
            {                 
                System.out.print(j+" ");             
            }                          
             
            System.out.println();
 
            Count++;
        }
        //I got the information from http://javaconceptoftheday.com.            
                        
                    
        }
        }
    

        

    

