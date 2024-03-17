package int2;

public  class classBB extends classAA{

	@Override
	public void method2() {
		
	System.out.print("method2");	
	}
	
public static void main(String[] args) {
	classBB b=new classBB();
	b.method1();
	b.method2();
}
}
