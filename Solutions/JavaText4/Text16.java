import java.io.*;
import java.util.*;

public class Text16
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try {
      file = new FileReader("../../Resources/JavaText4/text16.dat");
    } catch(FileNotFoundException fileNotFound) {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    int starting = fr.nextInt();
    int ending = fr.nextInt();
    int gallons = fr.nextInt();
    double price = fr.nextDouble();
    fr.nextLine();
    String model = fr.nextLine();
    System.out.printf("For your %s:\n  Ending mileage : %d\nStarting mileage : %d\n     Total miles : %d\n    Gallons used : %d\n           Price : $%.2f\n\nMiles per gallon : %.2f\n      Total cost : $%.2f\n", model, ending, starting, ending - starting, gallons, price, (double) (ending - starting) / gallons, (double) price * gallons);
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