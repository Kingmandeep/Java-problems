import java.util.*;
public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();
		a.add(54);
		a.add(98);
		a.add(68);
		a.add(35);
		a.add(98);
		a.add(68);
		a.add(57);
		System.out.println("--------------OLD NUMBER IN ARRAY-------------");
		System.out.println(a);
		System.out.println("Size of marks is : "+a.size());
		System.out.println();
		for(int i=0;i<a.size();i++)
		{
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)==a.get(j))
				{
					b.add(a.get(j));
					a.remove(j);
				}
			}
		}
		System.out.println();
		System.out.println("--------------REMOVE DUPLICATE NUMBER IN ARRAY--------");
		System.out.println(a);
		System.out.println("Size of marks is : "+a.size());
		System.out.println("Remove Number is: "+ b);

	}

}
