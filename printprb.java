package exam;

public class printprb {
	//write a java program to print prime number in between 50 to 105 ,then sum of the prime numbers
	

		static boolean isPrime(int num){
			int count =0;
			for(int i=1;i<=num;i++) {
				if(num % i == 0) count++;
			}
			if(count == 2) return true;
			else  return false;
		}
		
		static void printPrimeNumbers(int start,int end){
			
			for(int i=start;i<=end;i++) {
				
				if(isPrime(i)) {
					System.out.println(i);
				}
				
			}
			
		}
		
		public static void main(String[] args) {
		
			printPrimeNumbers(50,105);
			

		}

	}

		

	


