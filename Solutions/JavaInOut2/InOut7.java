import java.util.Scanner;

public class InOut7
{
  public static void main(String[] args)
  { 
    System.out.println("Please enter your name, place of employment, age, and the amount in years that you've been working, respectively:");
    Scanner kbd = new Scanner(System.in);
    String name = kbd.nextLine();
    String workLoc = kbd.nextLine();
    int age = kbd.nextInt();
    int workAge = kbd.nextInt();
    System.out.print("Name : " + name + "\nWork : " + workLoc + "\nTime : " + workAge + "\nAge  : " + age + "\n");
  }  
}
