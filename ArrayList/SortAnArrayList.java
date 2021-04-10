package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class SortAnArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
	    name.add("Mandeep");
	    name.add("Chandan");
	    name.add("Roushan");
	    name.add("Komal");
	    name.add("Manoj");
	    name.add("Gopal");
	    name.add("Juli");
	    Collections.sort(name);  // Sort cars
	    for (String i : name) {
	      System.out.println(i);
	    }
	}

}
