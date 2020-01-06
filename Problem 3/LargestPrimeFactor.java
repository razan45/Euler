
import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {
	
	public static void main(String[] args) {
		System.out.println(LargestPrimeFactor(600851475143d));
	}
	
	public static double LargestPrimeFactor(double num) {
		double biggestPrime=0.0;
		List<Double> primes = new ArrayList<Double>(); 
		for (double i=0; i<num;i++) {
			if (num%i==0&& isPrime(i)) {
				biggestPrime=i;
				primes.add(biggestPrime);
				if (checkifMultiplesup(primes,num)) {
					return biggestPrime;
				}
				System.out.println(biggestPrime);
			}
			
		}
		return biggestPrime;
		
	}
	
	
	private static boolean checkifMultiplesup(List<Double> primes, double num) {
		double result=1;
		for(Double dub: primes) {
			result=result*dub;
		}
		if (result==num) {
			return true;
		}
		return false;
	}

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
