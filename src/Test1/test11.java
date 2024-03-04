package Test1;

import java.util.Scanner;

public class test11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
	String 	Stringwospaces="";
	for(int i=0;i<=c.length-1;i++) {
		if((c[i]!=' ') && (c[i]!='\t')) {
			
			Stringwospaces=Stringwospaces+c[i];
		}
	}
	System.out.print(Stringwospaces);
		
	}

}
