package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_stuady {

	public static void main(String[] args) {
		 Vector v = new Vector();
		 v.add("pune");
		 v.add('A');
		 v.add(123);
		 v.add("pune");
		 v.add(null);
		 v.add(null);
		 v.add(1.2);
		 
		 System.out.println(v);
		 System.out.println(v.elementAt(1));
		 System.out.println(v.get(2));
		 System.err.println(v.remove(4));
		 System.out.println(v);
		 
		 System.out.println("===========");
		 
		ListIterator list = v.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		 System.out.println("===========");
		 
		Enumeration p = v.elements();
		while(p.hasMoreElements())
		{
			System.out.println(p.nextElement());
		}
	}

}
