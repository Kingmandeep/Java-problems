import java.util.Scanner;

public abstract class RverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		int i=s.length()-1;
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)==' ') i--;
			int j=i;
			if(i<0) break;
			while(i>=0 && s.charAt(i) != ' ')i--;
			if(ans.isEmpty()) {
				System.out.print(ans.concat(s.substring(i+1,j+1)+" "));
			}else {
				System.out.print(ans.concat(" "+s.substring(i+1,j+1)));
			}
			
		}
		

	}

	

}
