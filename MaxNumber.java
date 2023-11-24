package Method;

public class MaxNumber {
	
public static void main(String[] args) {
		
			int n=732068;
			
			int max = findMax(n);
		
			System.out.println("MAx value---->"+max);
		}

		private static int findMax(int n) {
			
			int max=0,r;
			while(n > 0) {
				r = n % 10;
				n = n/10;
				if(r > max) max= r;
			}
			
			return max;
		}

		
	}


