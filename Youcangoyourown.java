import java.util.Scanner;

public class Youcangoyourown {
    public static void main(String[] args) 
    {
        Scanner stdin = new Scanner(System.in);
		int nC = stdin.nextInt();
	
		// Process each case.
        for (int loop=1; loop<=nC; loop++) 
        {
			
			// Get string.
			int n = stdin.nextInt();
			String s = stdin.next();
			
			// Store result here.
			char[] res = new char[s.length()];
			
			// Just flip every letter.
            for (int i=0; i<s.length(); i++) 
            {
				if (s.charAt(i) == 'E')
					res[i] = 'S';
				else
					res[i] = 'E';
			}
			
			// Ta da!
			System.out.println("Case #"+loop+": "+new String(res));
		}	
    }
    
}
