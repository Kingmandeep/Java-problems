package list;

import java.util.ArrayList;

public class MyArrayList{

	public static void main(String[] args) {
		//{
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(98);
		ar.add(24);
		System.out.println(ar);
//	}
		
		Pairs<String,Integer> p1=new Pairs("Mndeep",18);
		Pairs<Boolean,String> p2=new Pairs("kumar",19);

		p1.getDescription();
		p2.getDescription();
	}
	

}
