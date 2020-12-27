package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Aravindh");
		a.add("Eeswar");
		a.add("Aravindh");
		System.out.println(a);
		a.add("Sunanda");
		a.add(2, "Vaishaali");
	 
		System.out.println(a);
		
		a.remove(2);
		System.out.println(a);
		
		System.out.println(a.get(2));
		
		boolean b= a.contains("Aravindh");
		System.out.println(b);
		System.out.println(a.indexOf("Aravindh"));
		boolean c = a.isEmpty();
		System.out.println(c);
		System.out.println(a.size());
			
	 
		
		
		 
		
	}

}
