import java.util.Scanner;

public class JavaArith14
{
  public static void main(String[] args)
  {
    System.out.println("Please enter the number of games won and the number of games lost, respectively:");
    Scanner kbd = new Scanner(System.in);
    int won = kbd.nextInt();
    int lost = kbd.nextInt();
    System.out.printf("Your team played %d games, winning %d and losing %d\nYour winning percentage is %.2f%%\n", won + lost, won, lost, (won / (double) (won + lost)) * 100);
  }
}