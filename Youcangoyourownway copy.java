import java.util.Scanner;

public class Youcangoyourownway {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            String b=sc.next();
            char[] d=new char[b.length()];
            for(int i=0;i<b.length();i++)
            {
                if(b.charAt(i)=='E')
                {
                    d[i]='S';
                }else{
                    d[i]='E';
                }
            }
            int p=1;
            System.out.println("Caseb #"+p+":  "+new String(d));
            p++;
            n--;
        }
    }
    
}
