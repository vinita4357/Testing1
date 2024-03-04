package testjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class reverselinkedlist {
	public static void main(String[] args) {
		
		
		List<Integer> l2=new LinkedList<Integer>();
		l2.add(9);
		l2.add(1);
		l2.add(null);
		Iterator i2=l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		System.out.println("Reverse linkedlist");
		Collections.reverse(l2);
		Iterator i3=l2.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
	}
	
	
	

}
