import java.util.Scanner;
class CountWordsInString
{
	static int countWords(String str)
	{
		int wc=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			wc++;
		}
		return wc;
	}



	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the word ");
	String str=scan.nextLine();
	System.out.println(countWords(str));
	}
}