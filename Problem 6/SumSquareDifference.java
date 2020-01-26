import java.util.ArrayList;
import java.util.List;

public class SumSquareDifference {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=100;i++){
		list.add(i);		
		}
		double sumofSquare=sumofSquares(list);
		double squareofSum=Math.pow((100*(100+1)/2),2);
		System.out.println(sumofSquare);
		System.out.println(squareofSum);
		System.out.println(sumofSquare-squareofSum);
	}

	private static double sumofSquares(List<Integer> list) {
		double result=0.0;
		for (Integer a:list) {
			//System.out.println(a);
			result+=Math.pow(a, 2);		
			System.out.println(result);
		}
		return result;
	}
}