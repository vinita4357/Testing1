package Test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class noofcharaclineswordsintextfile {
public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\vinita.chauhan\\Desktop\\Docs\\tests.txt"))	;

String currentline=br.readLine();
int count=0;int countwords=0;int charcount=0;
while (currentline!=null) {
	count++;
String[] s=currentline.toLowerCase().split(" ");
countwords=countwords+s.length;
for(String words : s) {
	charcount=charcount+words.length();
}

currentline=br.readLine();
}
System.out.println(count);
System.out.println(countwords);
System.out.println(charcount);
}

}

