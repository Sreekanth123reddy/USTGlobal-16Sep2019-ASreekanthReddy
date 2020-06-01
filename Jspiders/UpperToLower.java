	//wjp to define a method to convert every characters in string to uppercase case
import java.util.Scanner;
class UpperToLower
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word ");
		String str=scan.nextLine();
		System.out.println(toLowerCase(str));
	}
	static String toLowerCase(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(ch[i]+32);
		}
	
	str=new String(ch);
	return str;
}
}