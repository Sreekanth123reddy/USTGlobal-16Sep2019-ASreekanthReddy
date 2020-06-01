import java.util.*;
class CheckWordPresentInSentence
{
	static boolean isPresent(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
		int j=0,k=i;
		while(j<c2.length&&k<c1.length&&c1[k]==c2[j])
			{
				k++;
				i++;
			}
			if(j==c2.length)
		    return true;	
	}
	return false;
}   
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String str=scan.nextLine();
	boolean rs=isPresent(str,"reddy");
	if(rs)
		System.out.println("yes it is there");
	else
		System.out.println("No it is not there");
}
}