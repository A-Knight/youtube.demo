
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */


public class Praaaactice {

    public static void main(String[] args)
    {
        
      /*  Scanner kbd = new Scanner(System.in);
       
        String myWord;
        double myDouble;
        
        System.out.print("Please enter a word and a double");
        myWord = kbd.next();
        myDouble = kbd.nextDouble();
        kbd.nextLine();

if(myDouble < 1)  {
    
    
}      
        
        
else if(myDouble > 2)
{

}
        
        
        
        System.out.println("Press Enter...");
        kbd.nextLine();
        
        System.out.println("\n" + myWord + " " + myDouble);
        
    }
    
    int i, j;
    
    for(i=1; i <= 10; i++){
    
    for(j=1; j <= i; j++){
        
        System.out.print("* ");
    }
        
    System.out.println();
}*/
//        
// int testNum = 5;
// 
// System.out.println(5 + testNum);
        
     gcd(6, 10);
    
}
    
    public static int gcd(int a, int b)
    {
        Scanner kbd = new Scanner(System.in);
        System.out.print("\nEnter two positive integers: ");
        a = kbd.nextInt();
        b = kbd.nextInt();
        
        if(b==0)
            return a;
        else
            return gcd(b, a % b);
    }
}