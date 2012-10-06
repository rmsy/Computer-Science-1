import java.util.Scanner;

public class Methods6
{
  public static void log(String output)
  {
    System.out.println(output);
  }
  public static String[] input(String question, int numLines)
  {
    log(question);
    Scanner kbd = new Scanner(System.in);
    int i = 0;
    String[] response;
    response = new String[numLines];
    while(i < numLines)
    {
      response[i] = kbd.nextLine();
      i++;
    }
    return response;
  }
  public static int charCalc(String str1, String str2, String str3, String str4)
  {
    int result = 0;
    if(str1.length() > 10) {result++;}
    if(str2.length() > 10) {result++;}
    if(str3.length() > 10) {result++;}
    if(str4.length() > 10) {result++;}
    return result;
  }
  public static void main(String[] args)
  { 
    String[] strs;
    strs = new String[4];
    strs = input("Please enter four strings:", 4);
    log("You entered " + charCalc(strs[0], strs[1], strs[2], strs[3]) + " string(s) with more than 10 characters.");
  }
}