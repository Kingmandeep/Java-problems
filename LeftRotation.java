import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int p:a)
			System.out.print(p+" ");
		System.out.println();
		
		
		for(int i=0;i<m;i++)
		{   
			for(int k=0;k<a.length-1;k++)
			{
				int t=a[k];
				a[k]=a[k+1];
				a[k+1]=t;
			}
			
			
		}
		for(int p:a)
			System.out.print(p+" ");
		
		

	}

}
