import java.util.Scanner;

public class JavaArith4
{
  public static void main(String[] args)
  {
    System.out.println("Please enter two positive integers:");
    Scanner kbd = new Scanner(System.in);
    int[] numbers = new int[2];
    numbers[0] = kbd.nextInt();
    numbers[1] = kbd.nextInt();
    System.out.printf("%d divided by %d   = %d R. %d\nIn decimals, this = %.4f\n", numbers[0], numbers[1], numbers[0] / numbers[1], numbers[0] % numbers[1], (double) numbers[0] / numbers[1]);
  }
}