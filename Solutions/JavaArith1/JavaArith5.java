import java.util.Scanner;

public class JavaArith5
{
  public static void main(String[] args)
  {
    System.out.println("Please enter the number of donuts to buy and the number of attendees, respectively:");
    Scanner kbd = new Scanner(System.in);
    int donuts = kbd.nextInt();
    int attendees = kbd.nextInt();
    System.out.print("Number of donuts = " + donuts + "\nNumber of people = " + attendees + "\nEach person gets " + donuts / attendees + " donuts\nThere will be " + donuts % attendees + " donuts left\n");
      
  }
}