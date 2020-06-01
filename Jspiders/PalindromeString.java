//WJP to define a method to check the string palindrome or not 
import java.util.Scanner;
class PalindromeString
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word ");
		String str=scan.nextLine();
		if(true)
			System.out.println("String is Palindrome");
		
	}
	boolean isPalindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i++)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		return rev.equals(str); 	// boolean rs=rev.equals(str);
									//return rs;
	}
}