package exercise3;
import java.lang.Math;
import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double winkel;
    char ch;
    double Radiant;
    double Grad;

    do {
      winkel = input.nextDouble();
      ch = input.next().charAt(0);
      if (ch == 'r'){
        Grad = (winkel * 180) / Math.PI;
        System.out.println("Angle: " + Grad );
      } else {
        Radiant = (winkel * Math.PI) / 180;
        System.out.println("Angle: " + Radiant );
      }
    } while(ch == 'r' || ch == 'd');


  }
}
