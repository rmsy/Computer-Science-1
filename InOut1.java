import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Font;
import javax.imageio.ImageIO;
import java.lang.Throwable;

public class InOut1 {
  public static void main(String[] args) {
    
    //make sure user gave input
    if(args.length < 2) { //returns length of array in bytes, *NOT* length of a variable in characters
      System.out.println("Usage: InOut1 [first name] [last name] <letter character> <whitespace character>");
      System.out.println("[required] <optional>");
      return;
    }
    
    //allow for customization of the characters used
    String whitespaceChar;
    String letterChar;
    if(args.length == 3) {
      whitespaceChar = "-";
      letterChar = args[2];
    } else if(args.length == 4) {
      whitespaceChar = args[3];
      letterChar = args[2];
    } else {
      whitespaceChar = "-";
      letterChar = "#";
    }
        
    //render bitmap from first initials
    BufferedImage img = new BufferedImage(50, 32, BufferedImage.TYPE_INT_RGB); //new *buffered* image
    Graphics imgAssetsGraphics = img.getGraphics(); //new Graphics instance
    imgAssetsGraphics.setFont(new Font("Arial", Font.PLAIN, 24)); //set the font of the image via it's graphics manager
    Graphics2D imgAssetsGraphics2D = (Graphics2D) imgAssetsGraphics; //new Graphics2D instance
    imgAssetsGraphics2D.drawString(Character.toString(args[0].charAt(0)) + Character.toString(args[1].charAt(0)), 6, 24); //make the ASCII bitmap
    try {
      ImageIO.write(img, "png", new File("tmp.png")); //store the image to a file
    }
    catch(Throwable e) {
      System.out.println("Caught exception! Try again later.");
    }
    
    //print out the ASCII
    for(int yAxis = 0; yAxis < 32; yAxis++) { //repeat until we're on the top row of pixels
      for(int xAxis = 0; xAxis < 50; xAxis++) { //repeat until we're on the rightmost column of pixels
        StringBuilder string = new StringBuilder(); //create the string that we'll display later
        int pixel = img.getRGB(xAxis, yAxis); //get the pixel we'll be working with
        if(pixel == -16777216) { //if the pixel is black
          string.append(whitespaceChar);
        } else { //otherwise
          string.append(letterChar);
        }
        System.out.print(string);
      }
      System.out.printf("\r\n");
    }
    new File("tmp.png").delete(); //remove the temporary file
  }
}