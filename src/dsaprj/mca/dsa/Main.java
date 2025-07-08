package dsaprj.mca.dsa;

public class Main extends person{
	

	@Override
	void f1() {
		super.f1();
		System.out.println("raj");

	}

	public static void main(String[] args) {
		person p = new Main();
		
		p.f1();
		//System.out.println(p.f1());
 
	}

}
