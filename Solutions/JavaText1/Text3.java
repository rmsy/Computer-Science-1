import java.io.*;
import java.util.*;

public class Text3
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try
    {
      file = new FileReader("../../Resources/JavaText1/text3.dat");
    } catch(FileNotFoundException fileNotFound)
    {   
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    System.out.println("=====================");
    System.out.println("=Ln|           Value=");
    System.out.println("=====================");
    System.out.printf("= 1|%16s=\n= 2|%16s=\n= 3|%16s=\n", fr.nextLine(), fr.nextLine(), fr.nextLine());
    System.out.println("=====================");
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