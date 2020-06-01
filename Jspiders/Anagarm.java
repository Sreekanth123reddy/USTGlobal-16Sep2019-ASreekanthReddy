//check tw string are anagram aor not
import java.util.*;
class Anagram
{
		public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two sentence");
	String str1=scan.nextLine();
	String str2=scan.nextLine();
	boolean rs=isPanagram(str1,str2);
	if(rs)
		System.out.println("Anagram");
	else
		System.out.println("Not a Anagram");
	}

static boolean isAnagram(String s1,String s2)
{
	int count[]=new int[26];
	
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		int count1[]=new int[26];
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch>='A'&&ch<='Z')
				count1[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count1[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		
		return true;
}
}

