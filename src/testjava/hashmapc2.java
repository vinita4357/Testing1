package testjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapc2 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "vini");
		h.put(2, "ta");
	//	h.putIfAbsent(1, "ccc");
		h.putIfAbsent(3, "ccc");
		h.put(2, "ccc1");
		HashMap<Integer,String> h2=new HashMap<Integer,String>(h);
		String v=h2.get(2);
		System.out.print(v);
		Set<Entry<Integer,String>> s=h2.entrySet();
		for(Entry<Integer,String> e:s) {
			//System.out.println(e.getKey());
		//	System.out.println(e.getValue());
			if(e.getKey().equals(2)) {
				System.out.print(e.getValue());
				
			}
			
		}
		
	System.out.println("new program-------------");
Set<Integer> s1=	h2.keySet();
for(Integer i:s1) {
	System.out.print(i);
}
System.out.println("new program-------------");

Collection<String> l=h2.values();
for(String d:l)
	System.out.print(d);


			
		
		


	}

}
