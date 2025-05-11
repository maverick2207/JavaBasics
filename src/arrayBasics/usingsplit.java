package arrayBasics;

public class usingsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "ioojh-jkkkl-jhfkdh-ieijsdn";
		String arr[] = name.split("-");
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String name1 = "ioojh-jkkkl-jhfkdh@ieijsdn";
		String newname = name1.replace('@', '-');
		System.out.println(newname);
		String arr1[] = newname.split("-");
		
		for(int i = 0;i<arr1.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
