package Test1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class mostfrequentelementinarray {
public static void main(String[] args) {
	int[] a= {3,9,8,2,3,2,3,6,7,8,8,8};
	HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	for(int i=0;i<a.length;i++) {
		if(!h.containsKey(a[i])) {
			h.put(a[i], 1);
			
		}
		else {
			h.put(a[i],h.get(a[i])+1);
		}
	}
int element=0;
int frequency=1;
Set<Entry<Integer,Integer>> s1=h.entrySet();
for(Entry<Integer,Integer> e1: s1) {
	if(e1.getValue()>frequency) {
		frequency=e1.getValue();
		element=e1.getKey();
	}
}
System.out.print(element+" "+frequency);
}
}
