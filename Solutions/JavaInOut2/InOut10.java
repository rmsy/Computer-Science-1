import java.util.Scanner;

public class InOut10
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a string:");
    Scanner kbd = new Scanner(System.in);
    String str = kbd.nextLine();
    for(int i = 0; i < 5; i++)
    {
      System.out.printf("%s\n", str);
      str = "     " + str;
    }
  }
}