import java.io.*;
import java.util.*;

public class Text11
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try {
      file = new FileReader("../../Resources/JavaText3/text11.dat");
    } catch(FileNotFoundException fileNotFound) {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    double[] x = new double[2];
    double[] y = new double[2];
    x[0] = fr.nextDouble();
    y[0] = fr.nextDouble();
    x[1] = fr.nextDouble();
    y[1] = fr.nextDouble();
    System.out.printf("For points (%d, %d) and (%d, %d) the slope is %.4f\n", (int) x[0], (int) y[0], (int) x[1], (int) y[1], (y[1] - y[0]) / (x[1] - x[0]));
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