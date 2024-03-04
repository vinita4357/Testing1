package Test1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashh {
public static void main(String[] args) {
	
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(1, "India");
	h.put(2, "US");
	h.put(3, "UK");
	
	Set<Entry<Integer,String>> e=h.entrySet();
	for(Entry e1:e) {
		if(e1.getValue()=="US") {
			System.out.print(e1.getKey());
		}
	}
}
}
