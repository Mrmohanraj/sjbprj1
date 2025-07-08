package dsaprj.mca.dsa;

public class demo {

	public static void main(String[] args) {
		
		
		product p1 = new product(100,"adithya",120000);
		product p2 = new product(100,"adithya",120000);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());


	}

}
