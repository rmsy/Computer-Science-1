import java.util.Scanner;

public class JavaArith9
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a number:");
    Scanner kbd = new Scanner(System.in);
    int response = kbd.nextInt();
    System.out.printf("Number          Square          Cube\n====================================\n%6d%16d%14d\n%6d%16d%14d\n%6d%16d%14d\n%6d%16d%14d\n%6d%16d%14d\n",response, response * response, response * response * response, response + 1, (response + 1) * (response + 1), (response + 1) * (response + 1) * (response + 1), response + 2, (response + 2) * (response + 2), (response + 2) * (response + 2) * (response + 2), response + 3, (response + 3) * (response + 3), (response + 3) * (response + 3) * (response + 3), response + 4, (response + 4) * (response + 4), (response + 4) * (response + 4) * (response + 4));
  }
}
