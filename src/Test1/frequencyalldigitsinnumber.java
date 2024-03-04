package Test1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class frequencyalldigitsinnumber {
public static void main(String[] args) {
	int number=908789600;
	HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
	while(number>0) {
	int ld=number%10;
	if(!h.containsKey(ld)) {
		h.put(ld, 1);
	}
	else {
		h.put(ld, h.get(ld)+1);
	}
		
	number=number/10;	
	}
	Set<Entry<Integer,Integer>> e=h.entrySet();
	for(Entry<Integer,Integer> e1:e) {
		System.out.println(e1.getKey() +"repeated"+ e1.getValue());
	}
	
	
	
}
}
