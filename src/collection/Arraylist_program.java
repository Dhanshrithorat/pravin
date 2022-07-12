package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_program {

	public static void main(String[] args) {
		ArrayList<Object> p =new ArrayList<>();
		
		p.add("pravin");
		p.add('A');
		p.add(3);
		p.add(true);
		p.add(120.10);
		p.add(123);
		p.add(null);
		p.add(123);
		p.add(null);
		
		
		System.out.println(p);
		System.out.println(p.size());
		System.out.println(p.isEmpty());
		System.out.println(p.indexOf(123));
		System.out.println(p.lastIndexOf(123));
		System.out.println(p.contains("pravin"));
		System.out.println(p.get(8));
		System.out.println(p.remove(2));
		
		System.out.println("===============");
		
		for (int i=0;i<= p.size()-1;i++)
		{
			System.out.println(p.get(i));
		}
		System.out.println("===============");
		
		Iterator<Object> m = p.iterator();
		while (m.hasNext());
		{
			System.out.println(m.next());
		}
		System.out.println("===============");
		
		
		ListIterator<Object> itr = p.listIterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		System.out.println("===============");
		for(Object A:p);
		{
			System.out.println(p);
		}
		
		
		
		}

}
