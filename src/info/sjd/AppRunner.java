package info.sjd;

import java.util.logging.Logger;

public class AppRunner {

	public static int sumOfAllDigits1(int num) {
		int rest = 0;
		int result = 0;

		while (num > 0) {
			rest = num%10;			
			result += rest;
			num /= 10;
		}
		return result;
	}
	

	public static int sumOfAllDigits2(int num) {
		String num_string = Integer.toString(num);
		int result = 0;
		for (int i=0; i < num_string.length(); i++) {
			result += Character.getNumericValue(num_string.charAt(i));
		}
		return result;
	}

		
	public static boolean isPalindrome(int cand) {
		String str = Integer.toString(cand); 
		int len = str.length();
		
		for (int i=0, j=len-1; i < len/2; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}	
	
	public static int maxPalindrome(int NUM1_MIN, int NUM1_MAX,
									int NUM2_MIN, int NUM2_MAX) {
		
		int candidate = 0;
		int max_palindrome = NUM1_MIN * NUM2_MIN; //Start number;

		
		for (int j = NUM1_MIN; j <= NUM1_MAX; j++) {
			for (int k = NUM2_MIN; k <= NUM2_MAX; k++){
				candidate = j*k;
				
				if (isPalindrome(candidate) == true){
					if (candidate > max_palindrome) {
						max_palindrome = candidate;
					}
				}
				
			}
		}
		return max_palindrome;
	}
	
	
/**MAIN*******************************************************/	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(
				AppRunner.class.getName());
		
		/** Task 01
		 * Sum of all digits in 12345
		 * 1) module
		 * 2) character splitting
		 * */
		
		int num = 12345; //VALUE
		
		
		
		
		
		
		/** Solution 1*/
		int result = sumOfAllDigits1(num);		
		logger.info("Task1. Sum (Solution 1) = " + result);

		

		
			
		
		/** Solution 2*/
		result = sumOfAllDigits2(num);
		logger.info("Task1. Sum (Solution 2) = " + result);

		/* END OF TASK 1*/		
		
		
		
		
		
		
		
		
		
		/** Task 02
		 * Max Palindrome of two 4 rank numbers  
		 * */		

		final int NUM1_MIN = 1000;
		final int NUM2_MIN = 1000;
		final int NUM1_MAX = 9999;
		final int NUM2_MAX = 9999;
		
		int max_palindrome = maxPalindrome(NUM1_MIN,NUM1_MAX,NUM2_MIN,NUM2_MAX);
		
		logger.info(
				"Task2. Max palindrome of two 4-rank numbers multiplication  = " + 
				+ max_palindrome);
		/* END OF TASK 2*/		

		
		
		
		
		

		
	}
	
	

}