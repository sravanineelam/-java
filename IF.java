package selections;

public class IF {

	public static void main(String[] args) {
		float x1,r1,a=25.57f,x2,r2,b=25.58f;
		x1=a*100;
		r1=x1%100;
		x2=b*100;
		r2=x2%100;
		if(r1==r2) {
			System.out.println("they are same");
			
			
		}else {
			System.out.println("not same");
		}
		
		System.out.println("program ends");
	}

}
