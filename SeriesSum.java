import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float n=sc.nextFloat();
		float sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+((float)1/i);
			
		}
		System.out.println("Sum of Series is : "+ (float)sum);

	}

}
