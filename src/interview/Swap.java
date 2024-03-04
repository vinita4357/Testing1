package interview;

public class Swap {
	
	//java passes parameter by value not by refrence
	  public static void swapStrings(String x, String y)
	 { String temp = x; x=y; y=temp; } 
	 public static void main(String[] args) 
	 { String a = "1"; String b = "2"; swapStrings(a, b); 
	 System.out.println(a);
	 System.out.println(b);
	 }}


