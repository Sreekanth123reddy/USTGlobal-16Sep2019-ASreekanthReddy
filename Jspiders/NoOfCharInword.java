//WJP to print how many characters present in each word
import java.util.Scanner;
class NoOfCharInword
{

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence : ");
	String str=scan.nextLine();
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		String w="";
		while(i<ch.length&&ch[i]!=' ')
		{
			w=w+ch[i];
			i++;
		}
		if(w.length()>0)
			System.out.println(w+" - >"+w.length());
	}

	}
}