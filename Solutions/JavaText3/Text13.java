import java.util.*;
import java.io.*;

public class Text13
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try {
      file = new FileReader("../../Resources/JavaText3/text13.dat");
    } catch(FileNotFoundException fileNotFound) {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    int[] side = new int[3];
    side[0] = fr.nextInt();
    side[1] = fr.nextInt();
    side[2] = fr.nextInt();
      System.out.println("A tank that is " + side[0] + " X " + side[1] + " X " + side[2] + " has a volume of " + side[0] * side[1] * side[2] + " cu. units");
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