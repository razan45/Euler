
public class PalindromeProduct {
	
	public static void main(String[] args) {
		System.out.println(largestPalindrome());
	}
	
	public static int largestPalindrome() {
		int result=0;
		int biggest=0;
		for(int i=100;i<=999;i++) {
			for (int j=100;j<=999;j++) {
				result=i*j;
				if (result==reverseInt(result)) {
					if (result>biggest) {
						biggest=result;
					}
					
				}
			}
		}
		return biggest;
	}
	
	
	public static int reverseInt(int num) {
		String strNum=Integer.toString(num);
		String temp= "";
		for (int i=strNum.length()-1;i>=0;i--) {
			temp=temp+strNum.charAt(i);
		}
		return Integer.parseInt(temp);
		
		
	}
	

}
