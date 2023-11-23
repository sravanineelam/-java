package Method;

public class ArgsNoreturn {
	// methods-- 4 types
		//  args ...no return
		
		static void design(char c1,char c2){
			for(int i=1;i<5;i++) {
				System.out.print(c1);	
			}
			System.out.println();
			for(int i=1;i<5;i++) {
				System.out.print(c2);	
			}
			System.out.println();
			
			
		}
		public static void main(String[] args) {
			
			design('1','2');
			System.out.println("Hello");
			design('3','4');
			System.out.println("Welcome");
			design('5','6');
		}

	}

