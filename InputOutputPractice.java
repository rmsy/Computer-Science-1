import java.util.Scanner;

public class InputOutputPractice {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    System.out.println("Please enter a whole number:");
    String n = kbd.nextLine();
    System.out.println(n);
  }
}

//Scanner next = string until space
//nextLine to sanitize line
//charAt callback to find a specific character