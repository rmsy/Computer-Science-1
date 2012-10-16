import java.util.Scanner;

public class JavaArith10
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a linear equation in the form of aX+b=c, respectively:");
    Scanner kbd = new Scanner(System.in);
    double a = kbd.nextDouble();
    double b = kbd.nextDouble();
    double c = kbd.nextDouble();
    System.out.print("Your equation : " + (int) a + "X + " + (int) b + " = " + (int) c + "\nX = " + ((c - b) / a) + "\n");
  }
}
