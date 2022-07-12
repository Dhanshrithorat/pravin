package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList_Program {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add("pune");
		ll.add('A');
		ll.add(123);
		ll.add("pune");
		ll.add(null);
		ll.add(null);
		ll.add(1.2);
		
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		System.out.println(ll.getLast());
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		//System.out.println(ll.poll());
		System.out.println(ll.peekLast());
		//System.out.println(ll.peek());
		System.out.println(ll);
		
		System.out.println("============");
		//for each
				//iterator
				//listIterator
		for (Object k:ll)
		{
			System.out.println(k);
		}
		
		System.out.println("============");
		
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		

	}

}
