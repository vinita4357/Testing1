package Test1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class dupchar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<=c.length-1;i++) {
			if(!h.containsKey(c[i])) {
				h.put(c[i], 1);
			}
			else {
				h.put(c[i], h.get(c[i])+1);
			}
		}
		
		Set<Character> s1=h.keySet();
		for(Character cc:s1) {
			if(h.get(cc)>1) {
				System.out.println("Duplicate character"+cc+"Repeated "+h.get(cc));
			}
		}
	
	}

}
