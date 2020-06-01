//WJP to print no of occurance of each character in a present in the string
import java.util.Scanner;
class OccuranceOfChar
{

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence : ");
	String str=scan.nextLine();
	int count[]=new int[128];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		count[ch]++;
	}

	for(int i=0;i<count.length;i++)
	{
		if(count[i]!=0)
		System.out.println((char)i+" -> "+count[i]);
	}
	}
}
