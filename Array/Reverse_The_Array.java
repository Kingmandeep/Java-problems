public class Reverse_The_Array{
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int i=arr.length-1;
    System.out.println("Real Array");
    for(int t:arr)
    {
        System.out.print(t+"  ");
    }
    System.out.println();
    System.out.println("Reverse Array");
    while(i>=0)
    {
        System.out.print(arr[i]+"  ");
        i--;
    }

      
    
}
}