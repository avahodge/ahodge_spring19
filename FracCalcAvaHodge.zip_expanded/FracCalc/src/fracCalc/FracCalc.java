package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Please type an expression with fractions and/or mixed numbers to solve");
    		String str1 = scanner.nextLine();
    		System.out.println(produceAnswer(str1));
    		System.out.println("Would you like to calculate again? Type \"quit\" to end.");
    		
    		while(!str1.equals("quit")) {
    			System.out.println("Please type an expression with fractions and/or mixed numbers to solve.");
    		str1 = scanner.nextLine();
    		System.out.println(produceAnswer(str1));
    		System.out.println("Would you like to calculate again? Type \"quit\" to end.");
    		}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)  { 
        // TODO: Implement this function to produce the solution to the input
    	
    	String[] something = input.split(" ");
    	String fractionCalculation1 = something[0];
    	String fractionCalculation2 = something[2];
    	String decider1 = String.valueOf(fractionCalculation2.charAt(1));
    	String decider2 = String.valueOf(fractionCalculation1.charAt(1));
    	String whole1 = "1";
    	String whole2 = "1";
    	String numerator1 = "1";
    	String numerator2 = "1";
    	String denominator1 = "1";
    	String denominator2 = "1";
    	String[] splitUp1 = new String[2];
    	String[] splitUp2 = new String[2];
    	String[] splitMixedNum1 = new String[2];
    	String[] splitMixedNum2 = new String[2];
    	String numDenom1 = "0";
    	String numDenom2 = "0";
    	String[] numAndDenom1 = new String[2];
    	String[] numAndDenom2 = new String[2];
    	boolean mixedNumOrNot1 = false;
    	boolean mixedNumOrNot2 = false;
    	int mixedNumNumerator1 = 0;
    	int mixedNumNumerator2 = 0;
    	int maxDenom = Integer.valueOf(denominator2);
    	int minDenom = Integer.valueOf(denominator1);
    	int maxNumerator = mixedNumNumerator1;
    	int minNumerator = mixedNumNumerator2;
    	int finalWhole = 0;
    	int finalNumerator = 0;
    	int finalDenominator = 0;
    	String theAnswer = " ";
    	
    	//parses first fraction into parts
    	if(decider1.equals("_")) {
    		splitMixedNum1 = fractionCalculation1.split("_");
    		whole1 = String.valueOf(splitMixedNum1[0]);
    		numDenom1 = String.valueOf(splitMixedNum1[1]);
    		numAndDenom1 = numDenom1.split("/");
    		numerator1 = String.valueOf(numAndDenom1[0]);
    		denominator1 = String.valueOf(numAndDenom1[1]);
    		mixedNumOrNot1 = true;
    	}
    	else {
    		splitUp1 = fractionCalculation1.split("/");
    		whole1 = "0";
    		numerator1 = splitUp1[0];
    		denominator1 = splitUp1[1];
    		}
    	//parses second fraction into parts
    	if(decider2.equals("_")) {
    		splitMixedNum2 = fractionCalculation2.split("_");
    		whole2 = String.valueOf(splitMixedNum2[0]);
    		numDenom2 = String.valueOf(splitMixedNum2[1]);
    		numAndDenom2 = numDenom2.split("/");
    		numerator2 = String.valueOf(numAndDenom2[0]);
    		denominator2 = String.valueOf(numAndDenom2[1]);
    		mixedNumOrNot2 = true;
        	}
        else {
        	splitUp2 = fractionCalculation2.split("/");
        	whole2 = "0";
        	numerator2 = splitUp2[0];
        	denominator2 = splitUp2[1];
        }
    	 if(Integer.valueOf(denominator1) != Integer.valueOf(denominator2)) {
    		 if(Integer.valueOf(denominator1) > Integer.valueOf(denominator2)) {
    			 maxDenom = Integer.valueOf(denominator1);
    			 minDenom = Integer.valueOf(denominator2);
    		 }
    		 finalDenominator = minDenom * (maxDenom / minDenom);
    	 }
    	 else {
    		 finalDenominator = maxDenom;
    	 }
    	 mixedNumNumerator1 = (Integer.valueOf(whole1) * Integer.valueOf(denominator1)) + Integer.valueOf(numerator1);
    	 mixedNumNumerator2 = (Integer.valueOf(whole2) * Integer.valueOf(denominator2)) + Integer.valueOf(numerator2);
    	 if(mixedNumNumerator2 > mixedNumNumerator1) {
    		 maxNumerator = mixedNumNumerator2;
    		 minNumerator = mixedNumNumerator1;
    	 }
    	 	if(something[1].equals("+")) {
    	 		finalNumerator = mixedNumNumerator1 + mixedNumNumerator2;
    	 		if(finalNumerator >= finalDenominator) {
    	 			finalWhole = finalNumerator / finalDenominator;
    	 			finalNumerator = finalNumerator % finalDenominator;
    	 			if(finalNumerator > 0) {
    	 				theAnswer = String.valueOf(finalWhole) + "_" + String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
    	 			}
    	 			else {
    	 				theAnswer = String.valueOf(finalWhole);
    	 			}
    	 			return theAnswer;
    	 		}
    	 		else {
    	 			theAnswer = String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
    	 			return theAnswer;
    	 		}	
    	 	}
        	 else if(something[1].equals("-")) {
        		finalNumerator = maxNumerator - minNumerator;
        		if(finalNumerator >= finalDenominator) {
    	 			finalWhole = finalNumerator / finalDenominator;
    	 			finalNumerator = finalNumerator % finalDenominator;
    	 			if(finalNumerator > 0) {
    	 				theAnswer = String.valueOf(finalWhole) + "_" + String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
    	 			}
    	 			else {
    	 				theAnswer = String.valueOf(finalWhole);
    	 			}
    	 			return theAnswer;
    	 		}
    	 		else {
    	 			theAnswer = String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
    	 			return theAnswer;
    	 		}
        	 }
        	 else if(something[1].equals("*")) {
        		finalNumerator = mixedNumNumerator1 * mixedNumNumerator2;
        		if(finalNumerator >= finalDenominator) {
    	 			finalWhole = finalNumerator / finalDenominator;
    	 			finalNumerator = finalNumerator % finalDenominator;
    	 			if(finalNumerator > 0) {
    	 				theAnswer = String.valueOf(finalWhole) + "_" + String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
    	 			}
    	 			else {
    	 				theAnswer = String.valueOf(finalWhole);
    	 			}
    	 			return theAnswer;
    	 		}
    	 		else {
    	 			theAnswer = String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
    	 			return theAnswer;
    	 		}
        	 }
        	 else if(something[1].equals("/")) {
        		 finalNumerator = Integer.parseInt(numerator1) * Integer.parseInt(denominator2);
        		 finalDenominator = Integer.parseInt(denominator1) * Integer.parseInt(numerator2);
        		 if(finalNumerator >= finalDenominator) {
     	 			finalWhole = finalNumerator / finalDenominator;
     	 			finalNumerator = finalNumerator % finalDenominator;
     	 			if(finalNumerator > 0) {
    	 				theAnswer = String.valueOf(finalWhole) + "_" + String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
    	 			}
    	 			else {
    	 				theAnswer = String.valueOf(finalWhole);
    	 			}
     	 			return theAnswer;
     	 		}
     	 		else {
     	 			theAnswer = String.valueOf(finalNumerator) + "/" + String.valueOf(finalDenominator);
     	 			return theAnswer;
        	 	 }
        	 }
        	 else {
        		 theAnswer = "Cannot solve";
        		 return theAnswer;
        	 }
    }
}