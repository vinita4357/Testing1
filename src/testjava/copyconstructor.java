package testjava;

public class copyconstructor {
int id;
String name;

public copyconstructor(int i,String n) {
	System.out.println("parameter constructor");
	this.id=i;
	this.name=n;
	System.out.println(id);
	System.out.println(name);
}
public copyconstructor(copyconstructor c) {
	System.out.println("copy constructor");
	id=c.id;
	name=c.name;
	System.out.println(id);
	System.out.println(name);
}
public void display() {
	System.out.println(id);
	System.out.println(name);
}
	public static void main(String[] args) {
		copyconstructor c1=new copyconstructor(1,"vini");
		copyconstructor c2=new copyconstructor(c1);
		c1.display();
	
		c2.display();
	}
}
