package fracCalc;

public class Fraction {
	private int wholeNum;
	private int numerator;
	private int denominator;
	
	public Fraction(String originalFrac) {
		if(originalFrac.indexOf('_') != -1) {
			String willBecomeNumerator = originalFrac.substring(originalFrac.indexOf('_'), (originalFrac.indexOf('/') - 1));
			numerator = Integer.valueOf(willBecomeNumerator) * (wholeNum * denominator);
			String willBecomeDenom = originalFrac.substring(originalFrac.indexOf('/'), (originalFrac.length() - 1));
			denominator = Integer.valueOf(willBecomeDenom);
			String willBecomeWhole = originalFrac.substring(0, originalFrac.indexOf('_'));
			wholeNum = Integer.valueOf(willBecomeWhole);
			//wholeNum = Integer.valueOf(originalFrac.charAt(0));
		} else {
			wholeNum = 0;
			String willBecomeNumerator = originalFrac.substring(0, originalFrac.indexOf('/') - 1);
			numerator = Integer.valueOf(willBecomeNumerator);
			String willBecomeDenom = originalFrac.substring(originalFrac.indexOf('/'), (originalFrac.length() - 1));
			denominator = Integer.valueOf(willBecomeDenom);
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
		 return answerFrac.toString();
	    }
	    
	    public String subtractFrac(Fraction frac2) {
	    	Fraction answerFrac = new Fraction();
	    	answerFrac.numerator = (numerator * frac2.denominator) - (frac2.numerator * denominator);
	    	answerFrac.denominator = (denominator * frac2.denominator);
	    	return answerFrac.toString();
	    }
	
	    public String multiplyFrac(Fraction frac2) {
	    	Fraction answerFrac = new Fraction();
	    	answerFrac.numerator = numerator * frac2.numerator;
	    	answerFrac.denominator = denominator * frac2.denominator;
	    	return answerFrac.toString();
	    }
	    
	    public String divideFrac(Fraction frac2) {
	    	Fraction answerFrac = new Fraction();
	    	answerFrac.numerator = numerator * frac2.denominator;
	    	answerFrac.denominator = denominator * frac2.numerator;
	    	return answerFrac.toString();
	    }
	    
	    public String toString() {
	    	return numerator + "/" + denominator;
	    }

}