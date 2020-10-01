import java.util.Scanner;
/**
 * asks user for 3 integers, tells the user which one is greatest
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner to get input
    Scanner input = new Scanner(System.in);
    
    //initialize variables
    int number1; //the first number provided by the user
    int number2; //the second number provided by the user
    int number3; //the third number provided by the user

    //ask user for integers
    System.out.println("Please enter three integers on separate lines");
    //store those values in the number variables created earlier
    number1 = input.nextInt(); //store first number in the variable
    number2 = input.nextInt(); //store second number in the variable
    number3 = input.nextInt(); //store third number in the variable

    //check to see which number is the greatest
    if (number1 > number2 && number1 > number3){ //check if first number is greater than 2nd and 3rd
      System.out.println("Maximum: " + number1); //tell user first number is greatest
    }else if (number2 > number1 && number2 > number3){ //check if second number is greater than 1nd and 3rd
      System.out.println("Maximum: " + number2); //tell user second number is greatest
    }else if (number3 > number1 && number3 > number2){ //check if third number is greater than 1st and 2nd
      System.out.println("Maximum: " + number3); //tell user third number is greatest
    }
    
  }
}
