package selections;

public class vowels {
	public static void main(String[] args) {
		char ch= 'b';//a,e,i,o,u
		//a---97----122
		int[]vowels= {'a','e','i','o','u'};
		for(int i=0;i<vowels.length;i++) {
			if(ch==vowels[i]) {
				System.out.println("this is vowels");
				
			}else {
				System.out.println("this is con");
			}
		}

}
}