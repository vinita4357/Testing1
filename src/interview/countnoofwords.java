package interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class countnoofwords {
	
	public static void main(String[] args) {
String s="This this is is done by Saket Saket";
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		String[] s1=s.split(" ");
		for(String s2:s1) {
		if(!h.containsKey(s2))
		{
			h.put(s2, 1);}
			else{h.put(s2, (h.get(s2))+1);}
		
	
		
		
	}
	Set<Entry<String,Integer>> set=h.entrySet();
	for(Entry<String,Integer> e:set) {
		System.out.println(e.getKey()+" "+e.getValue());
	}
	
	}
}
