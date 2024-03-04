package Test1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class test114 {
	
	public static void main (String args[])


	{
	Set<Integer> treeSet=new TreeSet(new Comparator<Integer>()
	{
	public int compare(Integer o1,Integer o2)
	{
	return o2.compareTo(o1);
	}


	});
	treeSet.add(3);
	treeSet.add(1);
	treeSet.add(2);
	System.out.println(treeSet);
	String s1="vini";


	}

}