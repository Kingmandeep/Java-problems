import java.math.BigDecimal;
import java.util.*;
public class ConvertStringToFloat {

	public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        for(int i=1;i<n;i++)
        {
            float a=Float.parseFloat(s[i]); 
            for(int j=0;j<i;j++)
            {
                float b=Float.parseFloat(s[j]); 
                if(a>b)
                {
                    String t=s[j];
                    s[j]=s[i];
                    s[i]=t;
                }
            }
        }
        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
