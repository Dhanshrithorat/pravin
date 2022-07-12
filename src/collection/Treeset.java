package collection;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		ts.add("xyz");
		ts.add("velocity");
		ts.add("abc");
		ts.add("pune");
		ts.add("xyz");
		ts.add("XXX");
		ts.add("aaa");
		ts.add("AAA");
		//ts.add(110); we can store only homogenius data
		//ts.add(null);
		
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("xyz"));
		System.out.println(ts.remove("AAA"));
		System.out.println(ts);

	}

}
