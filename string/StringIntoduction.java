package string;

public class StringIntoduction {

	public static void main(String[] args) {
		String a="Mandeep";
		String sc = new String("Mandeep");
		String s=new String("King");
		String b=a+" "+s;
		String c=a+" Kumar";
//		String b=sc;
//		System.out.println("My Name is: "+a);
//		System.out.println("My Name is: "+sc);
//		System.out.println(sc==b);
// there are many features in String
		System.out.println(a);
		System.out.println(a.charAt(1));
		System.out.println(a.length());
		System.out.println(a.strip());
		System.out.println(a.endsWith("p"));
		System.out.println(a.replace("ee", "i"));
		System.out.println(a.substring(1,3));
		System.out.println(a.substring(2));
		System.out.println(a.contains("an"));
		System.out.println(a==sc);
		System.out.println(a.equals(sc));
		System.out.println(sc==s);
		System.out.println(a.isEmpty());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(b);
		System.out.println(a.trim());
		System.out.println(c);
		System.out.println(a.indexOf('d'));
		System.out.println(a.trim());//use for remove all free space before and after input 
		String cars="hundai,maruti,bmw,mercidege,oddi";
		String all[] = cars.split(",");
		for(String car:all) {
			System.out.print(car+"  ");
		}
		
	}

}
