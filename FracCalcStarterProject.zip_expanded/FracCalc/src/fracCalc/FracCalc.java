package fracCalc;
import java.util.*;



public class FracCalc {
	
	private int wholeNum;
	private int numerator;
	private int denominator;
	private int improperFracNumerator;
	
	public FracCalc(String originalFrac) {
		if(originalFrac.charAt(1) == '_') {
			wholeNum = Integer.valueOf(originalFrac.charAt(0));
			improperFracNumerator = numerator * wholeNum;
		} else {
			wholeNum = 0;
			improperFracNumerator = numerator;
		}
		if(originalFrac.charAt(1) == '/') {
			numerator = Integer.valueOf(originalFrac.charAt(0));
			denominator = Integer.valueOf(originalFrac.charAt(2));
		} else {
			numerator = Integer.valueOf(originalFrac.charAt(2));
			denominator = Integer.valueOf(originalFrac.charAt(4));
		}
		
	}
	
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type an expression with fractions or mixed numbers.");
    String input = scanner.nextLine();
    System.out.println(produceAnswer(input));
    
        // TODO: Read the input from the user and call produceAnswer with an equation

    }
    
    public static String addFrac(FracCalc frac1, FracCalc frac2) {
    }
    
    public static String subtractFrac(FracCalc frac1, FracCalc frac2) {
    	return "1";
    }
    
    public static String multiplyFrac(FracCalc frac1, FracCalc frac2) {
    	String finalNumerator = String.valueOf(frac1.improperFracNumerator * frac2.improperFracNumerator);
    	String finalDenom = String.valueOf(frac1.denominator * frac2.denominator);
    	return finalNumerator + "/" + finalDenom;
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
    	FracCalc fraction1 = new FracCalc(expression[0]);
    	FracCalc fraction2 = new FracCalc(expression[2]);
    	if(expression[1].equals("+")) {
    		return FracCalc.addFrac(fraction1, fraction2);
    	}
    	else if(expression[1].equals("-")) {
    		return "1";
    	}
    	else if(expression[1].equals("*")) {
    		return FracCalc.multiplyFrac(fraction1, fraction2);
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
