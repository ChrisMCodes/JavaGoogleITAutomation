/**
 * This is the first code-based question for the Module 2 quiz in
 * the Google IT Automation course on Coursera.
 * The course operates in Python: this is a translation into Java.
 *
 **/

import java.util.Scanner;

public class hexCode{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    String yourColor = "RED";

    try {

    System.out.println("Please enter the color and I'll give you the hexcode ");
    yourColor = input.nextLine();

    } catch (Exception e) { 

       System.out.println("The input value you submitted was not recognized. The color is defaulting to RED. Please restart the program if this is incorrect.");

    }

    System.out.println(colorTranslator(yourColor));


  } // main()

  public static String colorTranslator(String color){

    String hexColor = "unknown";
	
    if (color.toUpperCase().equals("RED")){

	hexColor = "#ff0000";
	
    } // if (color.toUpperCase.equals("RED"))

    else if (color.toUpperCase().equals("GREEN")) {

        hexColor = "#00ff00";

   } // if (color.toUpperCase.equals("GREEN")) 

    else if (color.toUpperCase().equals("BLUE")) {

        hexColor = "#0000ff";

   } // if (color.toUpperCase.equals("BLUE"))
   
    return hexColor;

  } // colorTranslator()
}
