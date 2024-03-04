package interview;

public class class1 {
	
	public static void main(String[] args) {
		String STR="a2b#yhh5$g";
		String STR1="";
		char[] c=STR.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			if(c[i]!='#' && c[i]!='$') {
				STR1=STR1+c[i];
			}
			else {
				
			}
		}
		System.out.print(STR1);
	}

}

