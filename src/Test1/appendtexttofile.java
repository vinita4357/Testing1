package Test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class appendtexttofile {
public static void main(String[] args) throws IOException {
	BufferedWriter b=new BufferedWriter(new FileWriter("C:\\Users\\vinita.chauhan\\Desktop\\tes.txt",true));
	b.write("sdfeej");
	b.close();
}
}
