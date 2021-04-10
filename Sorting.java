import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of marks");
		int n=sc.nextInt();
		int[] a=new int[n];
		int t;
		System.out.println("Enter marks: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean sorted=true;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				
				if(a[j]>a[i])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					sorted=false;
				}
			}if(sorted) break;
		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(a[i]+"  ");
//		}
		
		for(int item:a)
		{
			System.out.print(item+" ");
		}

	}

}
