import java.util.Scanner;

public class InOut8 
{
  public static void main(String[] args)
  {
    System.out.println("Please enter your name, GPA, class rank, and the number of students in your class, respectively:");
    Scanner kbd = new Scanner(System.in);
    String name = kbd.nextLine();
    double gpa = kbd.nextDouble();
    int rank = kbd.nextInt();
    int classSize = kbd.nextInt();
    System.out.printf("%s, whose gpa = %.4f, is #%d out of %d students\n", name, gpa, rank, classSize);
  }
}
