package Test1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Stringalphabetcount {
	public static void main(String[] args) {
		String s="vinita";
		char[] c=s.toCharArray();
		HashMap<Character,Integer> h=new 	HashMap<Character,Integer>();
		for(Character c1:c) {
			if(!h.containsKey(c1)) {
				h.put(c1, 1);
			}
			else {
				h.put(c1, h.get(c1)+1);
			}
		}
		
		Set<Entry<Character,Integer>> s1=h.entrySet();
		for(Entry<Character,Integer> e:s1) {
			System.out.print(e.getKey()+" "+e.getValue());
		}
	}

}
