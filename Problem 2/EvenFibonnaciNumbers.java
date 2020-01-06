
public class EvenFibonnaciNumbers {
	
	public static void main(String[] args) {
		System.out.println(SumofEvenFibbonaciNumbers(4000000));
	}
	public static int SumofEvenFibbonaciNumbers(int limit) {
		int sum=0;		
		int num1=0;
		int num2=1;
		int result=0;
		while(result<limit) {
			result=num1+num2;
			if (result%2==0) {
				sum+=result;
			}
			num1=num2;
			num2=result;
			
		}
		return sum;
		
	}
	
	
	

}
