import java.util.Scanner;

public class JavaArith11
{
  public static void main(String[] args) {
    System.out.println("Please enter two sets of x and y values, respectively:\nExample: [x] [y] [x] [y]");
    Scanner kbd = new Scanner(System.in);
    double[] x = new double[2], y = new double[2];
    x[0] = kbd.nextInt();
    y[0] = kbd.nextInt();
    x[1] = kbd.nextInt();
    y[1] = kbd.nextInt();
    System.out.printf("For the points (%d, %d) and (%d, %d) the slope = %.4f\n", (int) x[0], (int) y[0], (int) x[1], (int) y[1], (y[0] - y[1]) / (x[0] - x[1]));
  }
}