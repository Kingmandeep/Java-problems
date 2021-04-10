import java.util.Scanner;

public class RemoveAllDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		
		for(int i=0;i<a.length();i++)
		{
			boolean flag=true;
			for(int j=i+1;j<a.length();j++)
			{
				if(i!=j)
				{
					if(a.charAt(i)==a.charAt(j))
					{
						flag=false;
					}
				}
				
			}
			if(flag)
				System.out.print(a.charAt(i));
		}

	}

}
