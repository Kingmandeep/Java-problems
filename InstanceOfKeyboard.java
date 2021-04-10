import java.util.*;
public class InstanceOfKeyboard{
    public static void main(String[] args){
        int count=1;
        // ArrayList<Integer> a=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] b=new String[n];
        String[] a=new String[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.next();
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=i+1;j<b.length;j++)
            {
                if(b[i]==b[j])
                {
                    count++;
                    b = ArrayUtils.remove(b, j); 

                }

            }
            a[i]=count;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}