package testjava;

public class onestringcontainsanother {
	public static void main(String[] args) {
		/***
		String s1="vinita is good girl";
		String s2="s goo";
		if(s1.contains(s2)) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
		*/
		String s1="Exercises Practice Solution";
		String s2=s1.replaceAll("Solution","");
		System.out.print(s2);
		
	}

}
