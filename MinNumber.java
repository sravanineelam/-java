package Method;

public class MinNumber {
	public static void main(String[] args) {
		
		int n=462718;
		
		int max = findMin(n);
	
		System.out.println("MAx value---->"+max);
	}

	public static int findMin(int n) {
		
		int min=9,r;
		while(n > 0) {
			r = n % 10;
			n = n/10;
			if(r < min) min= r;
		}
		
		return min;
	}

	
}


