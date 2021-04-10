import javax.print.event.PrintJobListener;

import sun.jvm.hotspot.tools.SysPropsDumper;

public class GenereicExample{
	public <E> void generic(E[] s)
	{
		for(E q:s)
		{
			System.out.print(q+"  ");
		}
	}
    
	public static void main(String[] args){
		GenereicExample e1=new GenereicExample();
		String a[]={"Mandeep","Komal","Roushan","Chandan"};
		Integer b[]={56,98,78,68,97,527,547,68,7,98,57};
		e1.generic(a);
		System.out.println();
		e1.generic(b);
		
	}
}