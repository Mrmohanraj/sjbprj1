package dsaprj.mca.dsa;

public interface Game {
	
	void move();
	
	default void f1() {
		
		System.out.println("in interface");
		
	}

}
