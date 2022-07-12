package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Link_Hashset_Stuady {

	public static void main(String[] args) {
		
		LinkedHashSet lh = new LinkedHashSet();
		

		lh.add("pravin");
		lh.add(1234);
		lh.add('A');
		lh.add("pravin");
		lh.add(null);
		lh.add(null);
		lh.add(10.2);
		lh.add(true);
		
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.contains('A'));
		System.out.println(lh.size());
		lh.remove(1234);
		System.out.println(lh);
		
		System.out.println("=========");
		
		Iterator m = lh.iterator();
		
		while (m.hasNext())
		{
			System.out.println(m.next());
		}
		System.out.println("=========");
		
		for(Object n : lh)
		{
			System.out.println(n);
		}
		System.out.println("=========");
		
		lh.clear();
		lh.isEmpty();
		System.out.println(lh);
		
		
		
	}

}
