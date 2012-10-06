import java.util.Scanner;

public class Methods7
{
  public static void logResults(double leg1, double leg2, double hypotenuse)
  {
    System.out.printf("Leg1       : %.3f", leg1);
    System.out.printf("Leg2       : %.3f", leg2);
    System.out.printf("Hypotenuse : %.3f", hypotenuse);
  }
  public static void log(String output)
  {
    System.out.println(output);
  }
  public static double[] input(String question, int numEntries)
  {
    log(question);
    Scanner kbd = new Scanner(System.in);
    int i = 0;
    double[] response;
    response = new double[numEntries];
    while(i < numEntries)
    {
      response[i] = kbd.nextDouble();
      i++;
    }
    return response;
  }
  public static double hypotenuseCalc(double a, double b)
  {
    return (a*a) + (b*b);
  }
  public static void main(String[] args)
  { 
    input("
  }
}