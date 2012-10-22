import java.io.*;
import java.util.*;

public class Text1
{
  public static void main(String[] args)
  {
    FileReader file = null;
    try
    {
      file = new FileReader("D:\\Java\\Resources\\text1.dat");
    } catch(FileNotFoundException fileNotFound)
    {   
      System.out.println("The file was not available.");
      return;
    }
    Scanner fr = new Scanner(file);
    System.out.println("==============");
    System.out.println("=Line|  Value=");
    System.out.println("==============");
    System.out.printf("=   1|%7d=\n=   2|%7d=\n=   3|%7d=\n=   4|%7d=\n", fr.nextInt(), fr.nextInt(), fr.nextInt(), fr.nextInt());
    System.out.println("==============");
    try
    {
      Thread.sleep(10000);
    } catch(InterruptedException tooSoon) {}
    System.exit(1);
  }
}