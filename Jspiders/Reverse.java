class Reverse
{
	public static void main(String[] args) {

		Palindrome sm=new Palindrome();
		
		for(int i=1;i<=1000;i++)
		{
			boolean res=sm.isPalindrome(i);
			if(res==true)
			System.out.println(i);		
		}
		
	}
}
class Palindrome
{
	
	boolean isPalindrome(int n)
	{
		int t=n,rev=0;
		do
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	} while(n!=0);

	if(rev==t)
		return true;
	else
		return false;
	}

}