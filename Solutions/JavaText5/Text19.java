import java.io.*;
import java.util.*;

public class Text19
{
  public static void main(String[] args)
  {
    PrintWriter out = null;
    try {
      out = new PrintWriter("D:/Java/Resources/JavaText5/text19.out");
    } catch(IOException fileNotAvail) {
      System.out.println("The file was not accessible.");
      return;
    }
    System.out.println("Please enter your name, address, and age, respectively:");
    Scanner kbd = new Scanner(System.in);
    out.println("Name    : " + kbd.nextLine());
    out.println("Address : " + kbd.nextLine());
    out.print("Age     : " + kbd.nextLine());
    out.close();
  }
}