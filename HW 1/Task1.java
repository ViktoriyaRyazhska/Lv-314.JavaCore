import java.util.Scanner;
public class Task1 {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("Radius:");

      double radius = sc.nextDouble();
      double area = Math.PI * (radius * radius);
      System.out.println("Area: " + area);
      double perimeter= Math.PI * 2*radius;
      System.out.println("Perimeter: " + perimeter);
   }
}