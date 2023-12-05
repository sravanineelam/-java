package array;

public class array5 {

	public static void main(String[] args) {
		int[]n= {23,56,78,9,59,87,21};
		int max=n[0];
		int min=n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]>max) {
				max=n[i];
				
			}
if(min>n[i]) {
	min=n[i];
}
	}
System.out.println("max value-->"+max);
System.out.println("min value-->"+min);

}
}