import java.io.*;
import java.util.*;

public class Text17
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try {
      file = new FileReader("../../Resources/JavaText4/RightTriangle.dat");
    } catch(FileNotFoundException fileNotFound) {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    double[] sides = new double[2];
    sides[0] = fr.nextDouble();
    sides[1] = fr.nextDouble();
    System.out.printf("a =%8.3f\nb =%8.3f\nc =%8.3f\n", sides[0], sides[1], Math.sqrt((sides[0] * sides[0]) + (sides[1] * sides[1])));
    try {
      file.close();
    } catch(IOException closeError) {
      System.out.println("There was an error closing the file. It may still be open. Closing the environment to be safe...");
      try {
        Thread.sleep(10000);
      } catch(InterruptedException tooSoon) {}
      System.exit(1);
    }
  }
}