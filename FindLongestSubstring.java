import java.util.HashSet;

public class FindLongestSubstring {

	public static void main(String[] args) {
		
		String str="abcddcba";
		longest(str);

	}

	private static String longest(String str) {
		
		HashSet<Character> set=new HashSet<>();
		String longestOverall="";
		String longestTillnow="";
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(set.contains(c))
			{
				longestTillnow="";
				set.clear();
			}
			
			set.add(c);
			longestTillnow+=c;
			
			if(longestTillnow.length()> longestOverall.length()) {
				longestOverall=longestTillnow;
			}
		}
		System.out.println(longestOverall);
		return longestOverall;
		
	}

}
