import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a1=new int[n];
        String[] a2=new String[n];
        float[] a3=new float[n];
        for(int i=0;i<n;i++)
        {
        	a1[i]=sc.nextInt();
        	a2[i]=sc.next();
        	a3[i]=sc.nextFloat();
        	
        }
        
        for(int i=1;i<n;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		if(a3[j]<a3[i])
        		{
        			float t=a3[i];
        			a3[i]=a3[j];
        			a3[j]=t;
        			
        			String p=a2[i];
        			a2[i]=a2[j];
        			a2[j]=p;
        			
        		}
        	}
        }
        
        for(String k:a2)
        {
        	System.out.println(k);
        }

	}

}
