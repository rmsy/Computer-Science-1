import java.io.*;
import java.util.*;

public class Text5
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try
    {
      file = new FileReader("../../Resources/JavaText1/text5.dat");
    } catch(FileNotFoundException fileNotFound)
    {   
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    int[] scores = new int[4];
    scores[0] = fr.nextInt();
    scores[1] = fr.nextInt();
    scores[2] = fr.nextInt();
    scores[3] = fr.nextInt();
    System.out.printf("Tests   : %d %d %d %d\nAverage : %.3f\n", scores[0], scores[1], scores[2], scores[3], (scores[0] + scores[1] + scores[2] + scores[3]) / 4.0);
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