
public class Multiplesof3and5 {
	
	public static void main(String[] args) {
		System.out.println(sumOfMultiplesofThreeAndFive(10));
		System.out.println(sumOfMultiplesofThreeAndFive(1000));
	}

	public static int sumOfMultiplesofThreeAndFive(int limit) {
		int sum=0;
		for (int i=0;i<limit;i++) {
			if (i %3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
}
