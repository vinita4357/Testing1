package interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		Super s = new Subclass();
		s.foo();
	}
}

class Super {
	void foo() {
		System.out.println("Super");
	}
}

class Subclass extends Super {
	//static void foo() {
	//	System.out.println("Subclass");
	

}
