package testjava;

public class fibonacii {
	public static void main(String[] args) {
	
		int x=0,y=1;
		int z=0;
		System.out.println(x);
		System.out.println(y);
		int n=10;
		for(int i=1;i<=10;i++) {
			z=x+y;
			x=y;
			y=z;
		System.out.println(z);
		}
			
		}


}
