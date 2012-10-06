import java.util.Scanner;

public class InOut3
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter three decimal numbers:");
    double[] numbers;
    numbers = new double[3];
    numbers[0] = keyboard.nextDouble();
    numbers[1] = keyboard.nextDouble();
    numbers[2] = keyboard.nextDouble();
    System.out.printf("Your numbers were %.4f, %.4f, and %.4f\n", numbers[0], numbers[1], numbers[2]);
  }
}