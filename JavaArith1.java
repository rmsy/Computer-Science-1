import java.util.Scanner;

public class JavaArith1
{
  public static void main(String[] args)
  {
    final double PI = 3.14159;
    System.out.println("Please enter the radius of a circle:");
    Scanner kbd = new Scanner(System.in);
    double radius = kbd.nextDouble();
    System.out.printf("Your radius       =%10.4f\nThe diameter      =%10.4f\nThe circumference =%10.4f\nThe area          =%10.4f\n", radius, radius * 2,
                      (radius * 2) * PI, PI * (radius * radius));
  }
}