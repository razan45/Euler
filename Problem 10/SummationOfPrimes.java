import java.util.ArrayList;
import java.util.List;

public class SummationOfPrimes {
	
	public static void main(String[] args) {
		System.out.println(summationOfPrimes(2_000_000));
	}

	private static double summationOfPrimes(double limit) {
		List<Double> primes= new ArrayList<>();
		primes.add(2d); // Init a list with the first prime
		double summation=2; //Start off with the first prime
		for (double i=3;i<limit;i+=2) {			
			if (isPrime(i,primes)) {				
				primes.add(i);
				summation+=i;
				
			}			
		}
		return summation;
		
	}
	
	
	public static boolean isPrime( double num,List<Double> primes) {
		
		for(Double d: primes) {
			if(num%d==0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	

}
