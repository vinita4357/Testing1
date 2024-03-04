package Test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class hashh2 {
public static  void main(String[] args) {
	
	List<Integer> il=new ArrayList<Integer>();
	il.add(1);
	il.add(2);
	List<String> is=new ArrayList<String>();
	is.add("India");
	is.add("us");
	
	HashMap<String,List> h=new HashMap<String,List>();
	h.put("Integer", il);
	h.put("String", is);
	Set<Entry<String,List>> s=h.entrySet();
	for(Entry<String,List> s1:s)
	{
		if(s1.getKey().contains("Integer")) {
			System.out.print(s1.getValue());
		}
	}
	
	
	}

}
