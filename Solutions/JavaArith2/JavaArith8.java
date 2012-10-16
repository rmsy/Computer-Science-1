import java.util.Scanner;

public class JavaArith8
{
  public static void main(String[] args)
  {
    System.out.println("Please enter the measures of two interior angles of a triangle:");
    Scanner kbd = new Scanner(System.in);
    double[] angles = new double[2];
    angles[0] = kbd.nextDouble();
    angles[1] = kbd.nextDouble();
    System.out.printf("First angle = %.1f degrees\nSecond angle = %.1f degrees\nRemaining angle = %.1f degrees\n",
                      angles[0], angles[1], 180 - (angles[0] + angles[1]));
  }
}
