import java.util.Scanner;

public class JavaArith3
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a weight in ounces:");
    Scanner kbd = new Scanner(System.in);
    int ounces = kbd.nextInt();
    System.out.printf("You entered %d ounces\nThat's the same as %d pounds, %d ounces\n", ounces, ounces / 16, ounces % 16);
    System.out.print("You entered " + ounces + " ounces\nThat's the same as " + ounces / 16 + " pounds, " + ounces % 16 + " ounces\n");
  }
}