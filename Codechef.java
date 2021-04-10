
import java.util.Scanner;

 class Codechef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            String b1=sc.next();
            String b2=sc.next();
            int sum1=0,sum2=0;
            while(a>0)
            {
                int i=a-1;
                if(b1.charAt(i)=='0')
                {
                    sum1++;
                }
                if(b1.charAt(i)=='1')
                {
                    sum2++;
                }
                if(b2.charAt(i)=='0')
                {
                    sum1--;
                }
                if(b2.charAt(i)=='1')
                {
                    sum2--;
                }
                a--;
            }
            

            if(sum1==0 && sum2==0)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            n--;



        }
    }
    
}
