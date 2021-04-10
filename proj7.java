import java.util.Scanner;

public class proj7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            int su1=0,su2=0,s1=0,s2=0;
            String b=sc.next();
            String c=sc.next();
           
            for(int i=0;i<a;i++)
            {
                if(b.charAt(i)=='0')
                {
                   su1++;
                }else{
                    su2++;
                }
                if(c.charAt(i)=='0')
                {
                    s1++;
                }else{
                     s2++;
                }
            }
            if(su1==s1 && su2==s2)  System.out.println("YES");
            else System.out.println("NO");
            
            
            
        }
    }
    
}
