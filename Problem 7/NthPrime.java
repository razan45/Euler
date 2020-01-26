
public class NthPrime {
	
	public static void main(String[] args) {
		System.out.println(nthPrime(10001));
	}
	
	
	public static double nthPrime(double limit) {		
		double counter=0;
		double index= 1;
		while(counter !=limit) {
			index++;
			if(isPrime(index)) {
				counter++;
			}
			
			
		}
		return index;
		
	}
	
	//Using method from Problem 3
	public static boolean isPrime(double limit) {
		int numofDivisors=0;		
		for (double i=1;i<=limit;i++) {
			if (limit%i==0) {
				numofDivisors+=1;
			}
			if (numofDivisors>2) {
				return false;
			}
			
		}
		if (numofDivisors==2) {
			return true;
		}
		
		return false;
		
	}

}
