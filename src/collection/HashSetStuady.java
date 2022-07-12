package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStuady {

	public static void main(String[] args) {

		HashSet hs= new HashSet();
		
		hs.add("pravin");
		hs.add(1234);
		hs.add('A');
		hs.add("pravin");
		hs.add(null);
		hs.add(null);
		hs.add(10.2);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("pravin"));
		System.out.println(hs);
		//System.out.println(hs.remove("pravin"));
		System.out.println(hs);
		
		System.out.println("===============");
		
        Iterator h = hs.iterator();
        
        		while(h.hasNext())
        		{
        			System.out.println(h.next());
        		}
        		
        		System.out.println("===============");
        		
        		for(Object p:hs)
        		{
        			System.out.println(p);
        		}
        		System.out.println("===============");
        		hs.clear();
        		System.out.println(hs);
        		hs.isEmpty();
	}

}
