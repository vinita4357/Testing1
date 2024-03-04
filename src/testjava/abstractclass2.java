package testjava;

public  class abstractclass2 extends abstractclass1 {
	public void m1() {
		System.out.print(" childm1");
	}
	
	public static void main(String[] args)	{
		abstractclass1 a=new abstractclass2();
		a.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}


	
	
		
}
