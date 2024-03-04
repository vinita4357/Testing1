package int2;

public class sumofallnumbersofstring {

	public static void main(String[] args) {
		String s="2,5,1,6";
		String[] c1=s.split(",");
		int sum=0;
		for (int i=0;i<c1.length;i++) {
			
			sum=sum+Integer.parseInt(c1[i]);
		}
		System.out.print(sum);
	}
}
