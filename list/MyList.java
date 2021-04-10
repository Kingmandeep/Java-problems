package list;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class MyList {

	public static void main(String[] args) {
		
		List<String> ar=new LinkedList<>();
		List<String> a=new LinkedList<>();
		
		ar.add("Mandeep");
		ar.add("Babu");
		ar.add("Samrat");
		ar.add("Dev");
		a.add("Kumar");
		a.add("King");
		a.add("Mandeep");
		a.add("Raj");
		ar.addAll(a);
		System.out.println(ar);
		System.out.println(ar.get(2));
		ar.set(1, "Ravi");
		System.out.println(ar);		
		ar.remove(2);
		System.out.println(ar);
	
	
		List<String> toremove = new ArrayList();
		toremove.add("Ravi");
		toremove.add("Raj");
		ar.removeAll(toremove);
		System.out.println(ar);
		System.out.println(ar.size());

		System.out.println(ar.contains("Manish"));

		System.out.println(ar.contains("Kumar"));

		String temp[] = new String[ar.size()];
		ar.toArray(temp);
		for(String e:temp)
			System.out.println(e);
		for(String p:ar)
			System.out.println(p);
	}

}
