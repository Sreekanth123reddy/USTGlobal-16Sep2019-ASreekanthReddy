import java.util.Scanner;
class StringEx
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String str=scan.nextLine();
		int vc=0,cc=0,uc=0,lc=0,dc=0,sc=0;
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z')
			{
			uc++;
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vc++;
			else
				cc++;
			}
		else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>='0'&&ch<='9')
				dc++;
			else 
				sc++;
		}
		System.out.println("Vowels  :"+vc);
		System.out.println("small letters  :"+lc);
		System.out.println("upper letters  :"+uc);
		System.out.println("Consonants  :"+cc);
		System.out.println("digits  :"+dc);
		System.out.println("Special Characters  :"+sc);
			
}
}
