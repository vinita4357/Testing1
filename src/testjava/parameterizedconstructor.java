package testjava;

public class parameterizedconstructor {
	int id;
	String name;
	
	public parameterizedconstructor(int i,String n) {
		this.id=i;
		this.name=n;
	}
	
	public void display() {
		System.out.println("id"+id);
		System.out.println("name"+ name);
	}
	
	public static void main(String[] args) {
		parameterizedconstructor p=new parameterizedconstructor(1,"vinita");
		p.display();
		
	}

}
