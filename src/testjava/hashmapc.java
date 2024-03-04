package testjava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapc {
	
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "vini");
		h.put(2, "ta");
		HashMap<Integer,String> h2=new HashMap<Integer,String>(h);
		
		Set<Entry<Integer,String>> s=h2.entrySet();
		for(Entry<Integer,String> e:s) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			hashmapc d=new hashmapc();
			d.getClass();
		}
		
	}

}
