import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		int t1=0;
		int next;
		int t2=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(t1+" ");
			next=t1+t2;
			t1=t2;
			t2=next;
		}

	}

}
