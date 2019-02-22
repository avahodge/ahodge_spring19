package fracCalc;
import java.util.*;



public class FracCalc {
	
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type an expression with fractions or mixed numbers.");
    String input = scanner.nextLine();
    System.out.println(produceAnswer(input));
    
        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) {
    	
    	String[] expression = input.split(" ");
    	Fraction frac1 = new Fraction(expression[0]);
    	Fraction frac2 = new Fraction(expression[2]);
    	if(expression[1].equals("+")) {
    		//return frac1.addFrac(frac2).toString();
    		return "1";
    	}
    	else if(expression[1].equals("-")) {
    		return "1";
    	}
    	else if(expression[1].equals("*")) {
    		return frac1.multiplyFrac(frac2).toString();
    	}
    	else if(expression[1].equals("/")) {
    		return "1";
    	}
    	else {
    		return "Cannot solve";
    	}
        // TODO: Implement this function to produce the solution to the input
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
