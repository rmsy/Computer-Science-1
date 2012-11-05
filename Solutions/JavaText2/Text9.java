import java.io.*;
import java.util.*;

public class Text9
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try
    {
      file = new FileReader("../../Resources/JavaText2/text9.dat");
    } catch(FileNotFoundException fileNotFound)
    {   
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    String[] str = new String[3];
    str[0] = fr.nextLine();
    str[1] = fr.nextLine();
    str[2] = fr.nextLine();
    System.out.printf("String 1 : %s\nString 2 : %s\nString 3 : %s\n\nString 1 has %d characters\nString 2 has %d characters\nString 3 has %d characters\n", str[0], str[1], str[2], str[0].length(), str[1].length(), str[2].length());
    try
    {
      file.close();
    } catch(IOException closeError)
    {
      System.out.println("There was an error closing the file. It may still be open. Closing the environment to be safe...");
      try
      {
        Thread.sleep(10000);
      } catch(InterruptedException tooSoon) {}
      System.exit(1);
    }
  }
}