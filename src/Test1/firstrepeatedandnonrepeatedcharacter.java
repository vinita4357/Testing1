package Test1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class firstrepeatedandnonrepeatedcharacter {
public static void main(String[] args) {
	String str="Javaconceptoftheday";
	char[] c=str.toCharArray();
	LinkedHashMap<Character,Integer> h=new LinkedHashMap<Character,Integer>();
	for(int i=0;i<c.length;i++) {
		if(!h.containsKey(c[i])) {
			h.put(c[i], 1);
			
		}
		else {
			h.put(c[i], h.get(c[i])+1);
		}
	}
	
	Set<Entry<Character,Integer>> entry=h.entrySet();
	
	for(Entry<Character,Integer> e:entry) {
		if(e.getValue()==1) {
			System.out.println("1st not repeated"+e.getKey());	
			break;
		}
		
	}
	for(Entry<Character,Integer> e1:entry) {
		if(e1.getValue()>1) {
			System.out.println("1st  repeated"+e1.getKey());	
			break;
		}
		
	}
	
}
}
