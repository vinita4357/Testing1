package Test1;

public class class2 {
	public static void main(String[] args) {

		parentt pp=new childd();
		pp.foo1();
		
	}

}
class parentt{
	 private void foo() {
		 System.out.print("parentfoo1");
	 }
	 public void foo1() {
		 System.out.print("parentfoo1");
	 }
}

class childd extends parentt{
	 public void foo() {
		 System.out.print("childfoo1");
	 }
	 public void foo1() {
		 System.out.print("childfoo1");
	 }
}

 