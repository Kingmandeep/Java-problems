import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class VeryLargeNumberSumOrMultiply {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        BigInteger mul,sum;
	        String input1=sc.next();
	        String input2=sc.next();
	        BigInteger a = new BigInteger(input1); 
	        BigInteger b = new BigInteger(input2); 
	        sum = a.add(b);
	        mul = a.multiply(b);
	        System.out.println(sum);
	        System.out.println(mul);

	}

}
