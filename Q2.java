
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
public class Q2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What year?");
    int year = scan.nextInt();
    System.out.println("What day is the first day of January?");
    int startdayofMonth = scan.nextInt();
    int rollingDay = startdayofMonth;
    String[] month = {" ",
       "January", "February","March","April","May","June","July","August","September","October",
        "November","December"
    };
    int[] dayofmonth = {0,31,28,31,30,31,30,31,31,30,31,30,31
    };
    for(int i = 1; i <= 12; i++){
        //check if it is leap year
        if((year % 400 == 0 && i == 2)|| (year%4 ==0 && year%100 != 0))
         dayofmonth[2]=29;
        
        
         //display the calendar
    System.out.printf("          "+"%1$3s %2$2d\n", month[i],year);
    System.out.println("  Su  Mo  Tu  We  Th  Fr  Sa");
    
   //i got the information from:
   //https://www.reddit.com/r/learnprogramming/comments/484xze/homework_spacing_problem_in_a
//_yearly_calendar_in/?st=j7gl4fa6&sh=ee47853d
    int space = rollingDay % 7;
    for(int k = 0; k < space; k++){
        System.out.printf(" %s","   ");
    }
        rollingDay += dayofmonth[i];
    for(int j = 1; j <= dayofmonth[i]; j++){
        
        System.out.printf(" %3d",j);
        if(((j+space)%7==0))
            System.out.println();
        startdayofMonth+=1;
    }
          
    System.out.println();
        }
    
   
    
    }
}
