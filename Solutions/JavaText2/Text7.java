import java.io.*;
import java.util.*;

public class Text7
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try
    {
      file = new FileReader("../../Resources/JavaText2/text7.dat");
    } catch(FileNotFoundException fileNotFound)
    {   
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    System.out.printf("%10.4f\n%10.4f\n%10.4f\n%10.4f\n", fr.nextDouble(), fr.nextDouble(), fr.nextDouble(), fr.nextDouble());
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