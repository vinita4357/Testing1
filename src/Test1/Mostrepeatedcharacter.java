package Test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
//Most repeated word in string
public class Mostrepeatedcharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string");
		String s=sc.nextLine();
		String[] c=s.split("\\W+");
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		for(int i=0;i<=c.length-1;i++) {
			if(!h.containsKey(c[i])) {
				h.put(c[i], 1);
			}
			else {
				h.put(c[i], h.get(c[i])+1);
			}
		}
		
		Set<String> s1=h.keySet();
		for(String cc:s1) {
			if(h.get(cc)>1) {
				System.out.println("Duplicate String"+cc+"Repeated "+h.get(cc));
			}
		}
		int max=0;String mrw=null;
		Set<Entry<String,Integer>> entryset=h.entrySet();
		for(Entry<String,Integer> e1 : entryset) {
			if(e1.getValue()>max) {
				
				max=e1.getValue();
		
			
			}
		}
		System.out.println("Most Repeated Characters");
		for(Entry<String,Integer> e2 : entryset) {
			if(e2.getValue()==max) {
				
				System.out.println(e2.getKey());
		
			
			}
		}


	}



}
