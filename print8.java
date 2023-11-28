package exam;

public class print8 {
	//8
	//8 7
	//8 7 6
	//8 7 6 5
	//8 7 6 5 4
	//8 7 6 5 4 3
	//8 7 6 5 4 3 2
	//8 7 6 5 4 3 2 1
	public static void main(String[] args) {
	            int a=8;

		        for (int i = 1; i <= a; i++) {
		            for (int j = a; j >= i; j--) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
	}
	}
}


