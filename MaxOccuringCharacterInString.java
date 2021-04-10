import java.util.*;


public class MaxOccuringCharacterInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    char[] chars=a.toCharArray();
	    Arrays.sort(chars);
	    String b=new String(chars);
	    System.out.println(b);
	    int t=0;
	    for(int i=0;i<a.length();i++)
	    {
	    	int n=1;
	    	for(int j=i+1;j<a.length();j++)
	    	{
	    		
	    		if(b.charAt(i)==b.charAt(j))
	    		{
	    			n++;
	    			if(n>=t)
	    			{
	    				t++;
	    			}
	    			
	    		}
	    	}
	    }
	    System.out.println(t);

	}

	private static String sortString(String a) {
		// TODO Auto-generated method stub
		return null;
	}

}
