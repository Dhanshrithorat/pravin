package collection_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
         
		 ArrayList<Object> al= new ArrayList<>();
		 
		al.add("pravin");
		al.add(123);
		al.add(null);
		al.add("A");
		al.add(123);
		al.add("more");
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.lastIndexOf(123));
		System.out.println(al.indexOf(123));
		System.out.println(al.remove(6));
		System.out.println(al.contains("more"));
		
		System.out.println("==================================");
		
	for(int i=0;i<=al.size()-1;i++)
	{
      System.out.println(al.get(i));
	}

	System.out.println("===============");
	Iterator<Object> p = al.iterator();
	while(p.hasNext())
	{
		System.out.println(p.next());
	}
	System.out.println("===============");
	
	
	for(Object M:al);
	{
		System.out.println(al);
	}
	}
	
	
	
}
