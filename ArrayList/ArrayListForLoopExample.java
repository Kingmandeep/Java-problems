package ArrayList;
import java.util.*;
public class ArrayListForLoopExample {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("B M W");
		cars.add("Hundai");
		cars.add("Roles Roice");
		cars.add("Audi");
		cars.add("Mercedese");
		
		for(String t:cars)
			System.out.print(t+"   ");
		System.out.println();
		for(int i=0;i<cars.size();i++)
			System.out.println(cars.get(i));

	}

}
