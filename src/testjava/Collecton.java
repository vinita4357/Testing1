package testjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collecton {
	public void lst() {
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(5);
		ll.add(4);
		ll.add(2);
		ll.add(4);
		System.out.print(ll.get(0));
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
	}
	public void linkst() {
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(5);
		ll.add(4);
		ll.add(2);
		ll.add(4);
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}}
		
		public void sett() {
			Set<Integer> ll=new HashSet<Integer>();
			ll.add(5);
			ll.add(4);
			ll.add(2);
			ll.add(4);
			Iterator i=ll.iterator();
			while(i.hasNext()) {
				System.out.print(i.next());
			}
		}
		public void linkedsett() {
			Set<Integer> ll=new LinkedHashSet<Integer>();
			ll.add(5);
			ll.add(4);
			ll.add(2);
			ll.add(4);
			Iterator i=ll.iterator();
			while(i.hasNext()) {
				System.out.print(i.next());
			}
		}
			public void sett2() {
				Set<Integer> ll=new TreeSet<Integer>();
				ll.add(5);
				ll.add(4);
				ll.add(2);
				ll.add(4);
				Iterator i=ll.iterator();
				
				while(i.hasNext()) {
					System.out.print(i.next());
				}
	}
	public static void main (String[] args) {
		Collecton c=new Collecton();
		c.sett2();
		
		
	}

}
