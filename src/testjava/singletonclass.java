package testjava;

public class singletonclass {
public static void main(String[] args) {
	abc a=abc.getinstance();
}
}
class abc{
	static abc a=new abc();
	private abc() {
		
	}
	static abc getinstance() {
		return a;
	}
	
}

