import java.io.*;
import java.util.*;

public class Text14
{
  private static double sumArray(double[] args)
  {
    double sum = 0;
    for(int i = 0; i < 4; i++) {
      sum += args[i];
    }
    return sum;
  }
  public static void main(String[] args)
  {
    FileReader file = null;
    try {
      file = new FileReader("../../Resources/JavaText3/text14.dat");
    } catch(FileNotFoundException fileNotFound) {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    double[] items = new double[4];
    items[0] = fr.nextDouble();
    items[1] = fr.nextDouble();
    items[2] = fr.nextDouble();
    items[3] = fr.nextDouble();
    double taxRate = fr.nextDouble();
    System.out.printf("Your items cost:\n%23.2f\n%23.2f\n%23.2f\n%23.2f\n\ntax%20.2f\n=======================\nTotal%18.2f\n", items[0], items[1], items[2], items[3], sumArray(items) * taxRate, sumArray(items) + (sumArray(items) * taxRate));
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