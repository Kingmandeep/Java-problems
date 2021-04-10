package conditionalStatement;
import java.util.Scanner;
public class If_Else_Statement {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int a=sc.nextInt();
		if(a>150)
		{
			System.out.println("-----INVALID AGE---- ");
		}else {
			if(a>18)
			{
				System.out.println("Yes,You can vote");
			}else {
				System.out.println("No, You cannot Vote");
			}
		}
		
	}

}
