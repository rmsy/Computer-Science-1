import java.io.*;
import java.util.*;

public class Text15
{
  private static double toFahrenheit(double celcius)
  {
    return (9.0/5.0 * celcius) + 32;
  }
  public static void main(String[] args)
  {
    FileReader file = null;
    try {
      file = new FileReader("../../Resources/JavaText3/text15.dat");
    } catch(FileNotFoundException fileNotFound) {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    double[] celcius = new double[4];
    celcius[0] = fr.nextDouble();
    celcius[1] = fr.nextDouble();
    celcius[2] = fr.nextDouble();
    celcius[3] = fr.nextDouble();
    System.out.printf("%d degrees Celsius = %.1f degrees Fahrenheit\n%d degrees Celsius = %.1f degrees Fahrenheit\n%d degrees Celsius = %.1f degrees Fahrenheit\n%d degrees Celsius = %.1f degrees Fahrenheit\n", (int) celcius[0], toFahrenheit(celcius[0]), (int) celcius[1], toFahrenheit(celcius[1]), (int) celcius[2], toFahrenheit(celcius[2]), (int) celcius[3], toFahrenheit(celcius[3]));
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