package dsaprj.mca.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeSet;

public class DemoDSA {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(3);
		
		n.addFirst(78);
		n.add(2, 400);
		
		System.out.println(n);
		System.out.println(n.get(2));
		
		System.out.println("Linked list:");
		
		LinkedList<Integer> num = new LinkedList<Integer>();
		

		num.add(100);
		num.add(200);
		System.out.println(num);
		
		
		System.out.println("Set :");
		
		HashSet<Integer> num1=new HashSet<Integer>();
		num1.add(200);
		num1.add(500);
		num1.add(400);
		num1.add(200);
		System.out.println(num1);
		System.out.println("Tree Set:");
		
		TreeSet<Integer> h =new TreeSet<Integer>();
		h.add(200);
		h.add(500);
		h.add(400);
		h.add(200);
		System.out.println(h);
		
		
		
		System.out.println("Hash Map:");
		
		HashMap<Integer, String> d = new HashMap<Integer, String>();
		d.put(100, "adithya");
		d.put(101, "raj");
		d.put(100, "ram,");
		System.out.println(d);
		
		
		System.out.println("Linked Hash Map");
		
		LinkedHashMap<Integer	, String> l=new LinkedHashMap<Integer, String>();
		
		l.put(100, "mohan");
		l.put(101, "raj");
		l.put(102, "adithya");
		l.put(103, "yogesh");
		l.put(104, "srinivash");
		System.out.println(l);
		

		
		
		

		

	}

}
