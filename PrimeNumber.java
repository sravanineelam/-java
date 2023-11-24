package Method;
 //find last prime number in between given range like 10... 100....
public class PrimeNumber {

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
	
		printPrimeNumbers(10,100);
		

	}

}
