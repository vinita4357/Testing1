package testjava;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapremove2 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "vini");
		h.put(2, "ta");;
		h.put(3, "ccc1");
		HashMap<Integer,String> h2=new HashMap<Integer,String>(h);
		String v=h2.get(2);
		System.out.print(v);
		Set<Entry<Integer,String>> s=h2.entrySet();
		//h2.remove(2);
	
		for(Entry<Integer,String> e:s) {
		
			if((e.getKey().equals(2))&& (e.getValue().equals("tar"))) {
				h2.remove(e.getKey());
				break;
			}
			
		}
	
		System.out.println("after removing");
		Set<Entry<Integer,String>> s1=h2.entrySet();

		for(Entry<Integer,String> e1:s1) {
			
			System.out.print(e1.getKey());
			System.out.print(e1.getValue());
		}
		
		


	}

}
