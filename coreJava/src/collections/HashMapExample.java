package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Aravindh");
		hm.put(1, "Eeswar");
		hm.put(2, "Goodmmorning");
		hm.put(3, "Good Night");
	//	System.out.println(hm);
		//System.out.println(hm.get(2));
		//hm.remove(2);
		//System.out.println(hm.get(2));
		Set  sm = hm.entrySet ();
		Iterator  i = sm.iterator();
		
		while(i.hasNext()) {
			Map.Entry mp=(Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
