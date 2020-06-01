//WJP to define a method to check the string palindrome or not 
import java.util.Scanner;
class PalindromeStringWithotRev
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word ");
		String str=scan.nextLine();
		if(true)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
	boolean isPalindrome(String str)
	{
		int i=0;
		while(i<str.length()/2)
			{
				char c1=str.charAt(i);
				char c2=str.charAt(str.length()-1);
				if(c1!=c2)
					return false;
				i++;
			}
			return true;
	}
}