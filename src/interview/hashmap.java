package interview;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class hashmap {
public static void main(String[] args) {
	HashMap<String,Integer> hs=new HashMap<String,Integer>();
	hs.put("vinita", 1);
	hs.put("vinita2", 2);
	hs.putIfAbsent("vinita3", 1);
	System.out.println(hs.get("vinita"));
Set<Entry<String,Integer>>	s1=hs.entrySet();
for(Entry<String,Integer> e:s1) {
	System.out.println(e.getKey()+" "+e.getValue());
}
	
}
}
