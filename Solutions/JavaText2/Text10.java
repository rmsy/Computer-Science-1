import java.io.*;
import java.util.*;

public class Text10
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try
    {
      file = new FileReader("../../Resources/JavaText2/text10.dat");
    } catch(FileNotFoundException fileNotFound)
    {   
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    int correct = fr.nextInt();
    int incorrect = fr.nextInt();
    System.out.printf("Correct : %d\nWrong   : %d\n%% Correct = %.2f\n", correct, incorrect, correct / (double) (incorrect + correct));
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