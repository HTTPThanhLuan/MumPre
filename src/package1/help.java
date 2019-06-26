package package1;

public class help {
	 public static void main(String[] args) {
	        System.out.println(isPrime(3));
	    }
	 
		/**
		 * Caculating if the number is prime or not
		 * 
		 * @param n is the number that is in investigation
		 * @return true if the number is prime, false if not
		 */
		public static boolean isPrime(int n) {
			if (n <= 1)
				return false;

			if (n == 2)
				return true;

			if (n % 2 == 0)
				return false;

			for (int i = 3; i < (n / 2); i += 2) {
				if (n % i == 0)
					return false;
			}

			return true;
		}

		/**
		 * Search the array for element is exist in array or not
		 * 
		 * @param a: the array that is in vestigation
		 * @param e: the element being search about it in the array
		 * @return : the index of the first element in the array if not exist return -1
		 */
		private static int isExistInArray(int[] a, int e) {
			int index = -1;
			
			for (int i = 0; i < a.length && index == -1; i++) {
				if(e == a[i]) index =  i;
			}
			
			return index;
			
			
		}
		
		
		/**
		 * Search the array for element is exist in array or not
		 * 
		 * @param a: the array that is in vestigation
		 * @param e: the element being search about it in the array
		 * @return : the index of the first element in the array if not exist return -1
		 */
		private static int isExistInArray(char[] a, int e) {
			int index = -1;
			
			for (int i = 0; i < a.length && index == -1; i++) {
				if(e == a[i]) index =  i;
			}
			
			return index;
					
		}
}
