package testjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class list {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(9);
		l.add(1);
		l.add(null);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		List<Integer> l2=new LinkedList<Integer>();
		l2.add(9);
		l2.add(1);
		l2.add(null);
		Iterator i2=l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
	

}
