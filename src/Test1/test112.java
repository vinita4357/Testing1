package Test1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class test112 {
	

	 public static void main(String[] args) {	try {
			throw new Exception("Hello ");
	 } catch (IOException e) {
			System.out.print(e.getMessage());
		} catch (Exception e) {
			System.out.print(e.getMessage());
		
		} finally {
			System.out.println("World");
		}
	}
}
