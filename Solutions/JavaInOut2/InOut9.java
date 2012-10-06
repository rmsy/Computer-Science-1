import java.util.Scanner;

public class InOut9
{
  public static void main(String[] args)
  {
    Scanner kbd = new Scanner(System.in);
    String[] name = new String[3];
    int[] pages = new int[3];
    for(int i = 0; i < 3; i++)
    { 
      System.out.println("Please enter student " + (i + 1) + "'s name and how many pages they read over the summer, respectively:");
      name[i] = kbd.nextLine();
      pages[i] = kbd.nextInt();
      kbd.nextLine();
    }
    System.out.print("                Student        Pages\n++++++++++++++++++++++++++++++++++++\n");
    System.out.printf("1.%21s%13d\n", name[0], pages[0]);
    System.out.printf("2.%21s%13d\n", name[1], pages[1]);
    System.out.printf("3.%21s%13d\n", name[2], pages[2]);
  }
}