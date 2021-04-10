import java.util.Scanner;



public class prog2 {



    public void check(String[] s)
    {
        String s;
        int i=0,c=0;
       
        
        if(s.charAt(i)==1)
        {
            c=c*10+s.charAt(i);
            
        }
        i++;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;

        while(n>0)
        {
            
            String b=sc.next();
            int a=Integer.parseInt(b);

            if(a<1)
            {
                System.out.println("Case #i:  "+b);
            }else{
                prog2 p=new prog2();
                p.check(b);
                
            }

            
            


            n--;
            
        }
    }
    
}
