import java.io.*;
import java.util.*;

public class Text8
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try
    {
      file = new FileReader("../../Resources/JavaText2/text8.dat");
    } catch(FileNotFoundException fileNotFound)
    {   
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    double[] sides = new double[3];
    sides[0] = fr.nextDouble();
    sides[1] = fr.nextDouble();
    sides[2] = fr.nextDouble();
    int scale = fr.nextInt();
    System.out.printf("The original triangle sides were:\n%8.3f\n%8.3f\n%8.3f\n\nWith a scale factor of %d, the new triangle sides are:\n%8.3f\n%8.3f\n%8.3f\n", sides[0], sides[1], sides[2], scale, sides[0] * scale, sides[1] * scale, sides[2] * scale);
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