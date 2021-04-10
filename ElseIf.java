package conditionalStatement;
import java.util.Scanner;
public class ElseIf {

	public static void main(String[] args) {
		Scanner ec=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=ec.nextInt();
		if(a>=0 & a<=10)
		{
			System.out.println("Under 10");
		}else if(a>10 & a<=20)
		{
			System.out.println("Under 20");
		}
		else if(a>20 & a<=30)
		{
			System.out.println("Under 30");
		}else if(a>30 & a<=40)
		{
			System.out.println("Under 40");
		}
		else if(a>40 & a<=50)
		{
			System.out.println("Under 50");
		}else if(a>50 )
		{
			System.out.println("Greater than 50");
		}

	}

}
