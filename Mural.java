import java.util.Scanner;

public class Mural {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            String b=sc.next();
            int c[] =new int[b.length()];
            for(int i=0;i<a;i++)
            {
                c[i]=b.charAt(i) - '0';
            }

            int d=a/2;
            int max=0;
            int dp[]=new int[a];
            for(int i=0;i<d;i++)
            {
                dp[0]=dp[0]+c[i];
            }
            for(int i=1;i+d-1<a;i++)
            {
                dp[i]=dp[i-1]-c[i-1]+ c[i+d-1];
            }
            for(int i=0;i<a;i++)
            {
                max=Math.max(max, dp[i]);
            }
            int p=1;
            System.out.println("Case  #"+p+":  "+max);



            p++;
            n--;

        }
    }
}
