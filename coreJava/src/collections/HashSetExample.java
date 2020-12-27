package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
//hashset tree set linkeds hash set
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> a = new HashSet<String>();
		a.add("Aravindh");
		a.add("Adarsh");
		a.add("Sunanda");
		a.add("Prabhakar");
		
		//System.out.println(a);
		
		
		TreeSet<String> b = new TreeSet<String>();
		b.add("Aravindh");
		b.add("Adarsh");
		b.add("Sunanda");
		b.add("Prabhakar");
		//b.floor(e);
		System.out.println(b);
		System.out.println(b.pollFirst());

	}

}
