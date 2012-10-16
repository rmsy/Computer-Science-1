import java.util.Scanner;

public class JavaArith13
{
  public static void main(String[] args)
  {
    System.out.println("Please enter the individual costs of three items and the sales tax rate, respectively:");
    Scanner kbd = new Scanner(System.in);
    double[] prices = new double[3];
    prices[0] = kbd.nextDouble();
    prices[1] = kbd.nextDouble();
    prices[2] = kbd.nextDouble();
    double taxRate = kbd.nextDouble();
    System.out.printf("Items\n======================\n%22.2f\n%22.2f\n%22.2f\n======================\nTax%19.2f\n           ===========\nTotal%17.2f\n", prices[0], prices[1], prices[2], (prices[0] + prices[1] + prices[2]) * taxRate, (((prices[0] + prices[1] + prices[2]) * taxRate) + (prices[0] + prices[1] + prices[2])));
  }
}