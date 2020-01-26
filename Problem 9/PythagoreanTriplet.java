
public class PythagoreanTriplet {
	public static void main(String[] args) {
		System.out.println(pythagoreanTriplet(1000));
	}

	private static double pythagoreanTriplet(double limit) {
		double a=2;
		double b=3;
		double c=4;
		
		for (c=4;c<=limit;c++) {
			for (b=3;b<=c;b++) {
				for (a=2;a<=b;a++) {
					 if (checkIfPythagoreanTheoremHolds(a, b, c) && a+b+c==limit) {
						 System.out.println("a="+a +" b="+b+" c="+c);
						 return a*b*c;
					 }
					
				}
				
			}
			
			
		}
		
		return 0;
	}
	
	
	private static boolean checkIfPythagoreanTheoremHolds(double a, double b, double c) {
		//System.out.println("a="+a +" b="+b+" c="+c);
		if(Math.pow(a, 2) + Math.pow(b,2)==Math.pow(c,2)) {
			return true;
		}
		return false;
		
	}

}
