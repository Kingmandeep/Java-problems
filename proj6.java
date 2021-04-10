import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;

public class proj6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int p=0;
            int a=sc.nextInt();
            int b[] =new int[a];
            for(int i=0;i<a;i++)
            {
                b[i]=sc.nextInt();
            }
            for(int i=1;i<a;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(b[j]>b[i])
                    {
                        int t=b[j];
                        b[j]=b[i];
                        b[i]=t;
                    }
                }
            }
            int j,r=a;
            for(int i=0;i<a;)
            {
                int sum=0;
                int k=0;
                for( j=i+1;j<a;j++)
                {
                    
                    if(b[i]==b[j])
                    {
                        sum++;
                        k=j;

                    }
                }
                if(r>=sum)
                {
                    r=sum;
                    p=k;
                }
                i=j+1;
            }
            System.out.println(b[p]);
            n--;
        }
    }
}
