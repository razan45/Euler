import java.util.Arrays;
import java.util.List;

public class SmallestMultiple {
	//Brute force way
	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		System.out.println(list);
		System.out.println(smallestMultiple(list));
		
	}
	
	public static double smallestMultiple(List<Integer> list) {
		boolean found=false;
		//System.out.println(list);
		double counter=2;
		while(!found) {
			if (divisiblebyAll(counter,list)){
				found=true;
				return counter;
			}
			//System.out.println(counter);
			counter++;
		}		
		return counter;
			}

	private static boolean divisiblebyAll(double counter,List<Integer> list) {
		//System.out.println(list);
		for (Integer a:list) {
			//System.out.println(a);
			if(counter%a!=0) {
				return false;
			}
			
		}
		return true;
	}

}
