package exercise3;

import java.util.Scanner;

public class NamePrinter {
   public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);

      String name = input.next();
      char a = '1';
      for (int i = 0; i< name.length(); i++) {
        char l = name.charAt(i);
        System.out.println("* " + l + " *");
        
      }
   }
}
