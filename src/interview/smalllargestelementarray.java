package interview;

public class smalllargestelementarray {
	public static void main(String[] args) {
		int[] a= {10,20, 22, 30, 77};
		int k=a.length;
		int l=a[0];
		int s=a[0];
		for(int number:a) {
			if(number>l) {
				l=number;
			}
		}
		for(int number:a) {
			if(number<s) {
				s=number;
			}
		}
		System.out.println(l);
		System.out.println(s);
		
	}

}
