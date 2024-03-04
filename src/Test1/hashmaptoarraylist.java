package Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmaptoarraylist {
public static  void main(String[] args) {
	HashMap<String,Integer> h=new HashMap<String,Integer>();
	h.put("vinita", 1);
	h.put("sunita", 1);
	h.put("geeta", 1);
	Set<String> s1=h.keySet();
	ArrayList<String> a=new ArrayList<String>();
	for(String s:s1) {
		a.add(s);
	}
	ArrayList<Integer> b=new ArrayList<Integer>();
	for(String s:s1) {
		b.add(h.get(s));
	}
	Set<Entry<String,Integer>> ss=h.entrySet();
	ArrayList<Entry<String,Integer>> c=new ArrayList<Entry<String,Integer>>();
	for(Entry<String,Integer> e:ss) {
		c.add(e);
	}
}
}
