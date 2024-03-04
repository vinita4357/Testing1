package int2;

public class trycatchreturn {
	public static int m1() {
		try {
		
			return 1;
		}
		catch(Exception e) {
			
			return 2;
			
		}
		finally {
			System.exit(0);
			return 3;
		}
	}
	
	public static void main(String[] args) {
		trycatchreturn t=new trycatchreturn();
		System.out.print(t.m1());
	}

}
