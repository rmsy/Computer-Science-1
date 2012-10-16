import java.util.Scanner;

public class JavaArith12
{  
  public static void main(String[] args)
  {
    System.out.println("Please enter the starting odometer reading, the ending odometer reading, the number of gallons used, and the price per gallon, respectively:");
    Scanner kbd = new Scanner(System.in);
    double starting = kbd.nextDouble();
    double ending = kbd.nextDouble();
    double gallons = kbd.nextDouble();
    double price = kbd.nextDouble();
    System.out.printf("  Ending mileage : %d\nStarting mileage : %d\n     Total miles : %d\n    Gallons used : %d\n           Price : $%.2f\n\n\nMiles per gallon : %.2f\n      Total cost : $%.2f\n", (int) ending, (int) starting, (int) ending - (int) starting, (int) gallons, price, (ending - starting) / gallons, price * gallons);
  }
}