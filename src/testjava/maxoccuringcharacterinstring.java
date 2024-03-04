package testjava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class maxoccuringcharacterinstring {
	
	public static void main(String[] args) {
		String s="vanita";
		int k=s.length();
		char[] c=s.toCharArray();
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<k;i++) {
			if(!h.containsKey(c[i])) {
				h.put(c[i], 1);
			}
			else {
				
				h.put(c[i], h.get(c[i])+1);
			}
			
		}
		
		Set<Entry<Character,Integer>> s1=h.entrySet();
		int maxfrequency=0;
		int frequeency;
		char maxchar = 0;
		for(Entry<Character,Integer> e1:s1) {
			frequeency=e1.getValue();
			if(frequeency>maxfrequency) {
				maxfrequency=frequeency;
				maxchar=e1.getKey();
			}
		}
		
		System.out.println(maxfrequency);
		System.out.println(maxchar);
	
	
	
}

}
