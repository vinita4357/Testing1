package interview;

public class stringtotalcharacters {
	
	public static void main(String[] args) {
		String s="Scaler by InterviewBit";
		int n=0;
		String[] sa=s.split(" ");
		for (int i=0;i<sa.length;i++) {
			char[] c=sa[i].toCharArray();
			for(int j=0;j<c.length;j++) {
				n=n+1;
			}
		}
		
		System.out.println(n);
	}

}
