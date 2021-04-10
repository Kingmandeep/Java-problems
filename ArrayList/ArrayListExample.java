package ArrayList;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		name.add("Mandeep");
		name.add("Kumar");
		name.add("Gupta");
		System.out.println(name);
		System.out.println(name.get(2));
		name.set(1, "Shah");
		
		System.out.println(name);
		name.remove(2);
		System.out.println(name);
		System.out.println(name.contains("ndeep"));
		System.out.println(name.size());
		name.clear();
		System.out.println(name.isEmpty());

	}

}
