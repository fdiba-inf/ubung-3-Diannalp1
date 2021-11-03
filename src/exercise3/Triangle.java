package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int a = input.nextInt();
     int b = input.nextInt();
     int c = input.nextInt();
     double s = (a + b + c) / 2;
     double area = (Math.sqrt(s * (s - a) * (s - b) * (s -c)));
     
     do {
       if (a == b && b == c){
         System.out.println("Area: " + area);
         System.out.println("Triangle: equilateral");
         break;
       } else {
         if (a !=b && b == c){
            System.out.println("Area: " + area);
            System.out.println("Triangle: isosceles");
            break;
         } else {
           System.out.println("Area: " + area);
           System.out.println("Triangle: scalene");
           break;
         }
       } 
       
     } while(a + b > c);
   }
}