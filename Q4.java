/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mengjinglu
 */
public class Q4 {
    public static void main(String[] args) {
    
//    int x = 32;
//for(int i=0;i<65;i++){
//	System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x>>>i));
//}
    //For the first one, the value of x is evaluated before being turned into binary, and second one just turns the value x 
    //into binary string, and second line assigns x to the next shift of i.
int x = 32;
for(int i=0;i<65;i++){
	System.out.printf("%d\t\t%32s\n",i,Integer.toBinaryString(x));
	x = x >>> i;
}
    
    }
    

}
