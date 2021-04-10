package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		boolean is=false;
		boolean visited[] = new boolean[b.length()];
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				char c=a.charAt(i);
				is=false;
				for(int j=0;j<a.length();j++)
				{
					if(b.charAt(j)==c && !visited[j])
					{
						visited[j]=true;
						is=true;
						break;
					}
				}if(!is) {
					break;
				}
			}
		}String d=is ? "Anagram":"Not Anagram";
		System.out.println(d);
    }
}
