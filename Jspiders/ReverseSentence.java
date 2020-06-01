//Reverse the sentence
import java.util.*;
class ReverseSentence
{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String str=scan.nextLine();
	char ch[]=str.toCharArray();
	String rs="";
	for(int i=ch.length-1;i>=0;i--)
	{
		int j=i;
		while(i>=0 &&ch[i]!=' ')
		{
			i--;
		}
		int k=i+1;
		while(j>=k)
		{
			rs=rs+ch[k];
			k++;
		}
		if(i>0)
			rs=rs+ch[i];
	}
		System.out.println(rs);
}
}