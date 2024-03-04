package interview;

public class reversestring {
public static void main(String[] args) {
	String str="lol";
	char[] c=str.toCharArray();
	int k=c.length;
	String str2="";
	for(int i=k-1;i>=0;i--) {
		str2=str2+c[i];
	}
	System.out.print(str2);
	if(str.equals(str2)) {
		System.out.print("palindrome");
	}
}
}
