package int2;

public class classA extends CLASSB  {
	public void m1() {
		System.out.print("child m1");
	}
	private void m2() {
		System.out.print("child m2");
	}
	static void m3() {
		System.out.print("child m3");
	}
	public static void main(String[] args) {
		CLASSB p=new CLASSB();
	
		classA c=new classA();
	
		CLASSB p1=new classA();
	p1.m3();
	}
}
