//wJP to reverse the word in sentence
import java.util.*;
class ReverseWordInSentence
{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String str=scan.nextLine();
	char ch[]=str.toCharArray();
	String rs="";
	for(int i=0;i<ch.length;i++)
	{
		int j=i;
		while(i<ch.length && ch[i]!=' ')
		{
			i++;
		}
	int k=i-1;
	while(k>=j)
	{
		rs=rs+ch[k];
		k--;
	}
	if(i<ch.length)
		rs=rs+ch[i];
	}
	System.out.println(rs);
}
}