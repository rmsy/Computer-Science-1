import java.util.Scanner;

public class JavaArtih6
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a basketball player's name, number of attemped free throws, and number of successful free throws, respectively:");
    Scanner kbd = new Scanner(System.in);
    String name = kbd.nextLine();
    int attempted = kbd.nextInt();
    int successful = kbd.nextInt();
    System.out.printf("Name : %s\nFree throws attempted = %d\nFree throws made      = %d\nAverage               = %.3f\n", 
                      name, attempted, successful, (double) successful / attempted);
  }
}