package testjava;

public class cc extends pp {
private void ss() {
		System.out.println("child private");
	}

static void ss1() {
	System.out.println("child static");
}
public void ss2() {
	System.out.print("child public");
}

public static void main(String[] args) {
	pp p=new pp();
	cc c=new cc();
pp ppp=new cc();
ppp.ss1();
ppp.ss2();

	
}
}
