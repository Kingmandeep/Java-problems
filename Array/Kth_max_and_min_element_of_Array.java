import java.util.*;

public class Kth_max_and_min_element_of_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int a=sc.nextInt();
            int arr[]=new int[a];
            for(int i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int s=sc.nextInt();
            System.out.println();
            System.out.println(arr[s-1]);
           
            n--;

        }
    }
    
}
