import java.util.*;
import java.io.*;

public class Text12
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try {
      file = new FileReader("../../Resources/JavaText3/text12.dat");
    } catch(FileNotFoundException fileNotFound) {
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    System.out.println("The name entered was : " + fr.nextLine() + ", " + fr.nextLine() + " " + fr.nextLine().charAt(0) + ".");
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