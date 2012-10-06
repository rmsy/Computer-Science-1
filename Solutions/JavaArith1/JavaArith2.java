import java.util.Scanner;

public class JavaArith2
{
  public static void main(String[] args)
  {
    System.out.println("Please enter any length in inches:");
    Scanner kbd = new Scanner(System.in);
    double length = kbd.nextDouble();
    System.out.printf("%.1f inches = %.3f centimeters\n", length, length * 2.54);
  }
}