import java.util.Scanner;

public class Java_Stack {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int a1=0,a2=0,b1=0,b2=0,c1=0,c2=0;
            boolean t1=true;
            String input=sc.next();
            for(int i=0;i<input.length();i++)

            {
                if(input.length()==2)
                {
                    if(input.charAt(i)=='}' && input.charAt(i+1)=='{')
                    {
                        t1=false;
                    }else{
                        if(input.charAt(i)=='{')
                        {
                            a1=a1+1;
                        }
                        if(input.charAt(i)=='}')
                        {
                            a2=a2+1;
                        }
                        if(input.charAt(i)=='(')
                        {
                            b1=b1+1;
                        }
                        if(input.charAt(i)==')')
                        {
                            b2=b2+1;
                        }
                        if(input.charAt(i)=='[')
                        {
                            c1=c1+1;
                        }
                        if(input.charAt(i)==']')
                        {
                            c2=c2+1;
                        }

                    }
                }

                else{
                    if(input.charAt(i)=='{')
                    {
                        a1=a1+1;
                    }
                    if(input.charAt(i)=='}')
                    {
                        a2=a2+1;
                    }
                    if(input.charAt(i)=='(')
                    {
                        b1=b1+1;
                    }
                    if(input.charAt(i)==')')
                    {
                        b2=b2+1;
                    }
                    if(input.charAt(i)=='[')
                    {
                        c1=c1+1;
                    }
                    if(input.charAt(i)==']')
                    {
                        c2=c2+1;
                    }
                }
            }

            if(a1==a2 && b1==b2 && c1==c2)
            {
                if(!t1)
                {
                    System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }else{
                System.out.println("false");
            }
        }
    }
    
}
