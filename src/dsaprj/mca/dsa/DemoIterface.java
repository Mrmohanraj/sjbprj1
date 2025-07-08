package dsaprj.mca.dsa;

public class DemoIterface implements Game {

	public static void main(String[] args) {
		
		DemoIterface o = new DemoIterface();
		o.move();
		o.f1();

	}

	@Override
	public void move() {
System.out.println("moving left");		
	}

}
