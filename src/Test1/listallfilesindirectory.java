package Test1;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listallfilesindirectory {
public static void main(String[] args) {
	File f=new File("C:\\Users\\vinita.chauhan\\Desktop\\New folder");
	String[] s=f.list();
	for(String s1:s) {
		System.out.println(s1);
	}

}
}
