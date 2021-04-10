import java.util.Scanner;

public class Proj {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        
        
        while(n>0)
        {
            int sum1=0;
            int a=sc.nextInt();
          
            int b[][] = new int[a][a];
            int r=0,c=0;
            boolean row=false;
            boolean col = false;
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                {

                    b[i][j] = sc.nextInt();

                    if(i==j)
                    {

                        sum1=sum1+b[i][j];
                    }
                }

            }

            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                {
                    for(int k=0;k<a && k!=j;k++)
                    {
                        if(b[i][j] == b[i][k])
                        {
                            row = true;
                        }
                        if(b[j][i]==b[k][i])
                        {
                            col =  true;
                        }
                    }
                    
                   

                }
                if(row)
                    {
                        r++;
                        row=false;
                        
                    }
                    if(col)
                    {
                        c++;
                        col=false;

                    }

            }
            
           

            

            System.out.println("Case #"+p+"  "+sum1+"  "+r+"  "+c);

            p++;
            n--;
            
        }

    }
    
}
