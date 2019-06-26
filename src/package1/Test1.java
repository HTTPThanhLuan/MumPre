package package1;


public class Test1 {

	public static void main(String[] args) {
		System.out.println(primeCount(1, 5));
	}

	private static int primeCount(int start, int end) {
		int count = 0;

		for (int i = start; i <= end; i++) {
			if (help.isPrime(i))
				count++;
		}

		return count;
	}
	 
	
	private static int[] primeCount1(int start, int end) {
		int count = 0;

		
		List<int> rest= new ArrayList<>();
		
		
		for (int i = start; i <= end; i++) {
			if (help.isPrime(i)) 
				count++;
		}
		
		int result[] = new int[count];
		
		for (int i = start; i <= end; i++) {
			if (help.isPrime(i))
				count++;
		}
		
		
		return count;
	}

}
