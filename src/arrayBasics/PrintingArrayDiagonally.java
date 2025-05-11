package arrayBasics;

public class PrintingArrayDiagonally {

	public static void main(String[] args) {
		int n = 9;
		
		int count = n;
		
		//inverted pyramid
//		for (int i = 1 ; i<=n; i++) {
//			for(int p =0;p<i;p++) {
//				System.out.print(" ");
//			}
//			
//			for(int j = 1; j<=count;j++) {
//				System.out.print(j);
//				if(j==count) {
//					for(int k = count-1;k>0;k--) {
//						System.out.print(k);
//					}
//				}
//			}
//			
//			count--;
//			System.out.println("");
//		}
		//pyramid
		
		for(int i = 1;i<=n;i++) {
			for(int p = 0; p<count;p++) {
				System.out.print(" ");
			}
			
			for(int j =1;j<=i;j++) {
				System.out.print(j);
				if(j == i) {
					for(int k = i-1;k>0;k--) {
						System.out.print(k);
					}
				}
			}
			count--;
			System.out.println();
		}
		
		//*pyramid
		for(int i = 1;i<=n;i++) {
			for(int p = 0; p<count;p++) {
				System.out.print(" ");
			}
			
			for(int j =1;j<=i;j++) {
				System.out.print("*");
				if(j == i) {
					for(int k = i-1;k>0;k--) {
						System.out.print("*");
					}
				}
			}
			count--;
			System.out.println();
		}
	}

}
