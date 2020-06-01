//WJP to biggest length word from the sentence
import java.util.Scanner;
class LongAndSmallWordInSentence
{

	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence : ");
	String str=scan.nextLine();
	char ch[]=str.toCharArray();
	String hw="";
	String sw=str;
	for(int i=0;i<ch.length;i++)
	{
		String w="";
		while(i<ch.length&&ch[i]!=' ')
		{
			w=w+ch[i];
			i++;
		}
		if(hw.length()<w.length())
			hw=w;
		if(sw.length()>w.length())
			sw=w;
	}
	System.out.println("Highest word :"+hw);
	System.out.println("Smallest word :"+sw);
}
}
