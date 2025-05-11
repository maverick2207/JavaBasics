package arrayBasics;

public class PowerOfN {
	
	static int p = 10;
	static int n = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
		int j = p;
		while(j!=0) {
			
			k = k*n;
			j--;
		}
		
		System.out.println(n +" power of "+p+" is : "+k);

	}

}
