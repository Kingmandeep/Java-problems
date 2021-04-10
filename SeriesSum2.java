import java.util.Scanner;
import java.math.*;
public class SeriesSum2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		float n=sc.nextFloat();
		float sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=(float) (Math.pow(-1, i+1)*((float)1/i));
		}
		System.out.println(sum);

	}

}
