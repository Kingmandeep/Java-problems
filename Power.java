import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		System.out.println("ENter power: ");
		int y=sc.nextInt();
		int sum=1;
	
		for(int i=0;i<y;i++)
		{
			sum=sum*n;
		}
		System.out.println("Power of "+n+" is "+sum);

	}

}
