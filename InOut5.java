import java.util.Scanner;

public class InOut5
{
  public static void main(String[] args)
  {
    System.out.println("Please enter your first name, middle initial, and last name:");
    String[] response;
    response = new String[3];
    Scanner keyboard = new Scanner(System.in);
    response[0] = keyboard.next();
    response[1] = keyboard.next().substring(0, 1);
    response[2] = keyboard.next();
    System.out.println("Name    : " + response[0] + " " + response[1] + ". " + response[2]);
    System.out.println("Name    : " + response[2] + ", " + response[0] + " " + response[1] + ".");
  }
}