package testjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class sett {
	public static void main(String[] args) {
		Set<Integer> l=new HashSet<Integer>();
		l.add(9);
		l.add(1);
		l.add(null);
		l.add(9);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Set<Integer> l2=new LinkedHashSet<Integer>();
		l2.add(9);
		l2.add(1);
		l2.add(null);
		l2.add(9);
		Iterator i2=l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
	

}
