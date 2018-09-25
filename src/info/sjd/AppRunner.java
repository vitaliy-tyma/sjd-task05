package info.sjd;

public class AppRunner {


	
	public static boolean isPalindrom(int cand) {
		String str = Integer.toString(cand); 
		int len = str.length();
		
		for (int i=0, j=len-1; i < len/2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}	
	
	
	
	public static void main(String[] args) {
		/* Task 01
		 * Sum of all digits in 12345
		 * 1) module
		 * 2) character splitting
		 * */
		
		int num = 12345;
		String num_string = Integer.toString(num);
		
		int rest = 0;
		int result = 0;
		
		
		
		
		/*Solution 1*/
		while (num > 0) {
			
			rest = num%10;
			
			result += rest;
			
			num /= 10;
			

		}
		
		System.out.println("Sum (Solution 1) = "+result);


		
		
		/*Solution 2*/
		result = 0;
		
		for (int i=0; i < num_string.length(); i++) {
			result += Character.getNumericValue(num_string.charAt(i));
		}
		System.out.println("Sum (Solution 2) = "+result);
		/* END OF TASK 1*/		
		
		
		
		
		
		
		
		/* Task 02
		 * Max Palindrom of two 4 rank numbers  
		 * */		
		final int NUM1_MAX = 9999;
		final int NUM2_MAX = 9999;
		int candidate = 0;
		int max_palindrom = 0; //First palindrom
		
		for (int j = 0; j <= NUM1_MAX; j++) {
			for (int k = 0; k <= NUM2_MAX; k++){
				candidate = j*k;
				
				if (isPalindrom(candidate) == true){
					if (candidate > max_palindrom) {
						max_palindrom = candidate;
					}
				}
				
			}
		}
		System.out.println(
				"Max palindrom of two 4-rank numbers multiplication  = "
				+ max_palindrom);
		/* END OF TASK 2*/		

		
		
		
		
		

		
	}
	
	

}

/*
 			System.out.println("rest = " + num);
			System.out.println("num = " + rest);
			System.out.println("result = " + result);
//			System.out.println("rank = " + rank);
			System.out.println("");

 * */