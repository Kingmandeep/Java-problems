package ArrayList;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Mandeep");
		
		names.add("Kumar");
		names.add("23");
		names.add("India");
		
		names.remove(1);
		System.out.println(names);

	}

}
