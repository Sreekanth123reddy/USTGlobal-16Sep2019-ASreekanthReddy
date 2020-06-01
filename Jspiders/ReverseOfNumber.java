import java.util.Scanner;
class ReverseOfNumber
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int rev=in.nextInt();
		PalindromeOfNumber po=new PalindromeOfNumber();
		System.out.println(po.reverse(rev));
	}
}
class PalindromeOfNumber
{
	int reverse(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			 sum=sum*10+rem;
			n=n/10;
		}
		return sum;
	}
}