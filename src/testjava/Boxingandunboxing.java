package testjava;

public class Boxingandunboxing {
public static void main(String[] args) {
	//autobox
	int i=9;
	Integer i2=i;
	
	//boxing
	int i3=9;
	Integer i4=Integer.valueOf(i3);
	
	//autounboxing
	Integer i5=8;
	int i6=i5;
	
//	unboxing
	
	Integer i7=8;
	int i8=i7.intValue();
	
}
}
