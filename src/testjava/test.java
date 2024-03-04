package testjava;

public class test {

	public static void main(String[] args) {
		int i=0;
		int j=i;
		j=i++ +j;
		System.out.print(i+"-"+j);
	}
}
