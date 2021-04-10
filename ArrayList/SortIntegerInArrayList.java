package ArrayList;
import java.util.*;
public class SortIntegerInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(98);
		marks.add(65);
		marks.add(88);
		marks.add(68);
		marks.add(97);
		marks.add(90);
		marks.add(89);
		Collections.sort(marks);
		for(int i:marks)
			System.out.println(i);

	}

}
