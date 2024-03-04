package testjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class replaceduplicatecharacterinstring {
	

	public static void main(String[] args) {
		String s="vinita";
		String s2 = null;
			char[] c=s.toCharArray();
			int k=c.length;
			//vsnsta
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
			for(char c1:c) {
				if(!h.containsKey(c1)) {
					h.put(c1, 1);
				}
				else {
					h.put(c1, h.get(c1)+1);
				}
			}
			Set<Entry<Character,Integer>> s1=h.entrySet();
			for(Entry<Character,Integer> e1:s1) {
				if(e1.getValue()>1) {
			s2=		s.replace(e1.getKey().charValue(),'s');
				}
			}
			
			System.out.print(s2);
			
		
			}
	

}
