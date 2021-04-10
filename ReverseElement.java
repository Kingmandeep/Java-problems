import java.util.Scanner;

public class ReverseElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {54,68,98,57,24,98,98,67,947,32494,547,697,654,54,68,678,74};
		int low=0;
		int high=a.length-1;
		System.out.println("Prev Input");
//		 first method 
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"  ");
		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		System.out.println();
		System.out.println("Final Input");
		
		for(int i:a)
			System.out.print(i+"  ");
		// second method
//		while(low<high) {
//			int t=a[low];
//			a[low]=a[high];
//			a[high]=t;
//			low++;
//			high--;
//		}
//		System.out.println();
//		System.out.println("Final Input: ");
//		for(int i:a)
//			System.out.print(i+"  ");
		
	}
}
