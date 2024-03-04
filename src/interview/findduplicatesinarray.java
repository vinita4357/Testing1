package interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class findduplicatesinarray {
	public static void main(String[] args) {
		char[]s= new char[6];
		s[0] ='v';
		s[1] ='i';
		s[2] ='n';
		s[3] ='i';
		s[4] ='t';
		s[5] ='a';
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length;i++) {
			if(!h.containsKey(s[i])) {
				h.put(s[i], 1);
			}
			else {
				h.put(s[i], h.get(s[i])+1);
			}
		}
		Set<Entry<Character,Integer>> e=h.entrySet();
		for(Entry e1:e) {
			if(!e1.getValue().equals(1)) {
				System.out.println(e1.getKey()+" "+e1.getValue());
			}
		}
		
		

}

}
