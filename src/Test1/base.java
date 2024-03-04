package Test1;

public class base {
	
		public void run()
		{
		System.out.println("base");
		}
		class child extends base {
			public void run()
			{
			System.out.println("child");
			}
			public static void main(String args[])
			{
			base b= new base();    //upcasting
			b.run();
			}
}
}
