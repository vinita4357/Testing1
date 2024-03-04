package Test1;

import java.util.Arrays;

public class Anagramprogram {
	public  void main(String[] args) {
		String s1="mother in law";
		String s2="hitler woman";
		String s3=s1.replaceAll(" ", "");
		char[] c1=s3.toCharArray();
		String s4=s2.replaceAll(" ", "");
		char[] c2=s4.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Arrays.equals(c1, c2));
		
	}

}
