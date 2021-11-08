package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double a, b, c;

     do {

     
     a = input.nextDouble();
     b = input.nextDouble();
     c = input.nextDouble();
     double s = (a + b + c) / 2;
     if ((a + b) > c && (b +c) > a && (c + a) > b) {

       double area = (Math.sqrt(s * (s - a) * (s - b) * (s -c)));
       System.out.println("Area: " + area);
     
       if (a == b && b == c){ 
         System.out.println("Triangle: equilateral");
         
       } else if (a == b) {
            System.out.println("Triangle: isosceles");
            
         } else {
           System.out.println("Triangle: scalene");
           
         }
       } else {
         System.out.println("Values are not correct!");
       }

     } while (a > 0 && b > 0 && c > 0);
     
       
      
   }
}