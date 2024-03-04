package Test1;

import java.util.HashMap;

public class hashmap extends custom{

	public static void main(String[] args) {
		HashMap<custom,String> h= new HashMap<custom,String>();
		custom c1=new custom();
		c1.id=1;
		c1.name="v";
		c1.number=1;
		custom c2=new custom();
		c2.id=2;
		c2.name="i";
		c2.number=2;
		custom c3=new custom();
		c3.id=1;
		c3.name="v";
		c3.number=2;
		h.put(c1, "india1");
		h.put(c2, "india2");
		h.put(c2, "india3");
	}
}
