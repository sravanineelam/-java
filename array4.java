package array;

public class array4 {

	public static void main(String[] args) {
		char ch[];
		ch=new char[6];
		ch[0]='0';
		ch[1]='s';
		ch[2]='e';
		ch[3]='3';
		ch[4]='r';
        ch[5]='9';
        for(int i=ch.length-1;i>0;i--) {
        	System.out.println(ch[i]+" ");
        }

	}

}
