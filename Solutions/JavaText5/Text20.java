import java.io.*;
import java.util.*;

public class Text20
{
  public static void main(String[] args)
  {
    PrintWriter out = null;
    try {
      out = new PrintWriter("E:/Java/Resources/JavaText5/text20.out");
    } catch(IOException fileNotAvail) {
      System.out.println("The file was not accessible.");
      return;
    }
    System.out.println("Please enter four integers:");
    Scanner kbd = new Scanner(System.in);
    int[] numbers = new int[4];
    numbers[0] = kbd.nextInt();
    numbers[1] = kbd.nextInt();
    numbers[2] = kbd.nextInt();
    numbers[3] = kbd.nextInt();
    out.println("Your numbers were:");
    out.println(numbers[0]);
    out.println(numbers[1]);
    out.println(numbers[2]);
    out.println(numbers[3]);
    out.printf("The average = %.3f", (numbers[0] + numbers[1] + numbers[2] + numbers[3]) / (double) 4);
    out.close();
  }
}