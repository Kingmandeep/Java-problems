package linkedList;
import java.util.*;
public class MainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList myLL = new MyLinkedList();
		
		for(int i=1;i<100;i++)
		{
			myLL.add(i);
		}
		
		myLL.print();
		
//		List<Integer> a=new LinkedList<>();
//		List<Integer> b=new ArrayList<>();
//		getTimeDiff(b);
//		getTimeDiff(a);
//		a.add(54);
//		a.add(98);
//		a.add(99);
//		a.add(78);
//		a.add(88);
////		
//		System.out.println(a);
//		Collections.sort(a);
//		System.out.println(a);
//		a.toArray();
//		System.out.println(a);
//		System.out.println(a.get(2));
//		a.set(1, 70);
//		System.out.println(a);
	
		}

//	static void getTimeDiff(List<Integer> list) {
////		long start = System.currentTimeMillis();
////		for(int i=0;i<100000;i++) {
////			list.add(0,i);
////		}
////		long end=System.currentTimeMillis();
////		System.out.println(list.getClass().getName()+" --> "+(end-start));
//	}

}
