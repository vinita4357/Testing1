package testjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class reversearraylist {
	
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(5);
		a.add(4);
		a.add(2);
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.reverse(a);
		
		Iterator i1=a.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		}
		
		


	}


