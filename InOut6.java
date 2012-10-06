import java.util.Scanner;

public class InOut6
{
  public static void main(String[] args)
  {
    System.out.println("Please enter your name, age, and hourly wage, respectively:");
    Scanner kbd = new Scanner(System.in);
    String name = kbd.nextLine();
    int age = kbd.nextInt();
    double wage = kbd.nextDouble();
    System.out.printf("%20s\n", name);
    System.out.printf("%20d\n", age);
    System.out.printf("              $%5.2f\n", wage);
  }
}