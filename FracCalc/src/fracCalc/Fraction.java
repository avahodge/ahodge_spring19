package fracCalc;

public class Fraction {
	private int wholeNum;
	private int numerator;
	private int denominator;
	
	public Fraction(String originalFrac) {
		if(originalFrac.indexOf('_') != -1) {
			String willBecomeNumerator = originalFrac.substring(originalFrac.indexOf('_') + 1, originalFrac.indexOf('/'));
			numerator = Integer.parseInt(willBecomeNumerator);
			String willBecomeDenom = originalFrac.substring(originalFrac.indexOf('/') + 1);
			denominator = Integer.parseInt(willBecomeDenom);
			String willBecomeWhole = originalFrac.substring(0, originalFrac.indexOf('_'));
			wholeNum = Integer.parseInt(willBecomeWhole);
		} else {
			wholeNum = 0;
			String willBecomeNumerator = originalFrac.substring(0, originalFrac.indexOf('/'));
			numerator = Integer.parseInt(willBecomeNumerator);
			String willBecomeDenom = originalFrac.substring(originalFrac.indexOf('/') + 1);
			denominator = Integer.parseInt(willBecomeDenom);
		}
	}
	
	public Fraction() {
		wholeNum = 0;
		numerator = 0;
		denominator = 1;
	}
	
	 public String addFrac(Fraction frac2) {
		 Fraction answerFrac = new Fraction();
		 answerFrac.numerator = (numerator * frac2.denominator) + (frac2.numerator * denominator);
		 answerFrac.denominator = (denominator * frac2.denominator);
		 return answerFrac.toStringSimplify();
	    }
	    
	    public String subtractFrac(Fraction frac2) {
	    	Fraction answerFrac = new Fraction();
	    	answerFrac.numerator = (numerator * frac2.denominator) - (frac2.numerator * denominator);
	    	answerFrac.denominator = (denominator * frac2.denominator);
	    	return answerFrac.toStringSimplify();
	    }
	
	    public String multiplyFrac(Fraction frac2) {
	    	Fraction answerFrac = new Fraction();
	    	answerFrac.numerator = numerator * frac2.numerator;
	    	answerFrac.denominator = denominator * frac2.denominator;
	    	return answerFrac.toStringSimplify();
	    }
	    
	    public String divideFrac(Fraction frac2) {
	    	Fraction answerFrac = new Fraction();
	    	answerFrac.numerator = numerator * frac2.denominator;
	    	answerFrac.denominator = denominator * frac2.numerator;
	    	return answerFrac.toStringSimplify();
	    }
	    
	    public String toStringSimplify() {
	    	if(numerator > denominator) {
	    	return numerator + "/" + denominator;	
	    	} else {
	    		wholeNum = numerator / denominator;
	    		numerator = numerator % denominator;
	    		if(numerator == 0) {
	    			return String.valueOf(wholeNum);
	    		} else {
	    			return wholeNum + "_" + numerator + "/" + denominator;
	    		}
	    	}
	    }

}

