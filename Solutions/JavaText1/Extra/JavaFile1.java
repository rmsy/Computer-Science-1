import java.io.*;
import java.util.*;

public class JavaFile1
{
  public static void main(String[] args)
  {
    FileReader file = null;
    Scanner kbd = new Scanner(System.in);
     System.out.println("Please enter a filepath:");
    try
    {
      file = new FileReader(kbd.nextLine());
    } catch(FileNotFoundException fileNotFound)
    {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    try
    {
      while(true)
      {
        System.out.println(fr.nextLine());
      }
    } catch (NoSuchElementException eof)
    {
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
}