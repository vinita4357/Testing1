package testjava;

import java.util.ArrayList;
import java.util.Iterator;

public class addingarraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println("Before adding list");
		Iterator i1=a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	
	ArrayList<Integer> a2=new ArrayList<Integer>();
	a2.add(4);
	a2.add(5);
	a2.add(6);
	
	a1.addAll(a2);
	System.out.println("After adding list");
	Iterator i2=a1.iterator();
	while(i2.hasNext()) {
		System.out.println(i2.next());
	}
	}
}


