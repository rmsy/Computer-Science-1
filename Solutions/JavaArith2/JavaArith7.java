import java.util.Scanner;

public class JavaArith7
{
  public static void main(String[] args)
  {
    System.out.println("Please enter the number of questions on a test, and the number of questions you got right, respectively:");
    Scanner kbd = new Scanner(System.in);
    int possible = kbd.nextInt();
    int actual = kbd.nextInt();
    System.out.printf("There were %d questions on the test\nYou answered %d correctly\nYou missed %d\nThe percentage correct was %.1f%%\n",
                      possible, actual, possible - actual, ((double) actual / possible) * 100);
  }
}