package Test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class mostrepeatedwordintext {
public static void main(String[] args)  {
	 
	try {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\vinita.chauhan\\Desktop\\Docs\\tests.txt"))	;
	
HashMap<String,Integer> h=new HashMap<String,Integer>();
String currentline=br.readLine();
while (currentline!=null) {
String[] s=currentline.toLowerCase().split(" ");
for(int i=0;i<s.length;i++) {
	if(!h.containsKey(s[i])) {
		h.put(s[i], 1);
	}
	else {
		h.put(s[i], h.get(s[i])+1);
	}
}

currentline=br.readLine();
}
	
int frequency=1;
String element = null;
Set<Entry<String,Integer>> s1=h.entrySet();
for(Entry<String,Integer> e1:s1) {
	if(e1.getValue()>frequency) {
		frequency=e1.getValue();
		element=e1.getKey();
	}
}
System.out.print(element+" "+frequency);
}

catch(Exception e) {
	System.out.print(e.getMessage());
}
}}
