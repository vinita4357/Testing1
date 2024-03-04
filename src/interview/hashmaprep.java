package interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmaprep {
	public static void main(String[] args) {
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		h1.put("one", 1);
		h1.put("two", 2);
		Set<Entry<String,Integer>> s=h1.entrySet();
		for(Entry e:s) {
			System.out.print(e.getKey()+" " +e.getValue());
		}
		h1.replace("one", 1, 3);
		Set<Entry<String,Integer>> s2=h1.entrySet();
		for(Entry e1:s2) {
			System.out.print(e1.getKey()+" " +e1.getValue());
		}
	}

}
