package fracCalc;

public class Fraction {
	private int wholeNum;
	private int numerator;
	private int denominator;
	
	public Fraction(String originalFrac) {
		if(originalFrac.indexOf('_') != -1) {
			new String afterWholeNum = originalFrac.substring(originalFrac.indexOf('_'), (originalFrac.length() - 1);
			numerator = Integer.valueOf(afterwholeNum.charAt(1));
			//wholeNum = Integer.valueOf(originalFrac.charAt(0));
		} else {
			wholeNum = 0;
		}
		if(originalFrac.charAt(1) == '/') {
			numerator = Integer.valueOf(originalFrac.charAt(0));
			denominator = Integer.valueOf(originalFrac.charAt(2));
		} else {
			numerator = Integer.valueOf(originalFrac.charAt(2));
			denominator = Integer.valueOf(originalFrac.charAt(4));
		}
		
	}
	
	public Fraction() {
		wholeNum = 0;
		numerator = 0;
		denominator = 1;
	}
	/*
	 public static Fraction addFrac(Fraction frac2) {
	 answerFrac.numerator = (answerFrac.numerator * frac2.denominator) + (frac2.numerator * answerFrac.denominator);
	    	return this;
	    }
	    
	    public static Fraction subtractFrac(Fraction frac2) {
	    	return this;
	    }
	  
	    */
	
	    public Fraction multiplyFrac(Fraction frac2) {
	    	Fraction answerFrac = new Fraction();
	    	answerFrac.numerator = numerator * frac2.numerator;
	    	answerFrac.denominator = denominator * frac2.denominator;
	    	return answerFrac;
	    }
	    
	    public String toString() {
	    	return wholeNum + "_" + numerator + "/" + denominator;
	    }

}
