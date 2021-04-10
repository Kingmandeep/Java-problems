import java.util.Scanner;

public class Rectangle {
    
    static void Area(double l , double b){

        return l* b;
        
    }
    public static void main(String[] args) {
        double length,breadth;
        Scanner sc=new Scanner(System.in);
        length = sc.nextDouble();
        breadth = sc.nextDouble();
        

        System.out.println(Area(length,breadth));


    }
    
}
