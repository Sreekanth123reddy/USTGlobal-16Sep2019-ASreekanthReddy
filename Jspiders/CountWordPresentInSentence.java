import java.util.*;
class CountWordPresentInSentence
{
	static int isPresent(String s1,String s2)
	{
		int count=0;
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
		int j=0,k=i;
		while(k<c1.length&&j<c2.length&&c1[k]==c2[j])
			{
				k++;
				i++;
			}
			if(j==c2.length)
			{
				count++;
				i=k-1;
			}	
	}
return count;
}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String str=scan.nextLine();
	int  rs=isPresent(str,"reddy");
	
		System.out.println(rs);
	
}


}