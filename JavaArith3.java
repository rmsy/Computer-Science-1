import java.util.Scanner;

public class JavaArith3
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a weight in ounces:");
    Scanner kbd = new Scanner(System.in);
    int weight = kbd.nextInt();
    System.out.printf("You entered %d ounces\nThat's the same as %d pounds, %d ounces\n", weight, weight / 16, weight % 16);
  }
}