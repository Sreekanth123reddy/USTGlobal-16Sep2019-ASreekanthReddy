import java.util.Scanner;
class PalindromeNumber
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=scan.nextInt();
	int rev=0,t=num;
	do
	{
	int rem=num%10;
	rev=rev*10+rem; 
	num=num/10;
	}
	while(num!=0);
	if(rev==t)
	System.out.println("The number is palindrome");
	else
	System.out.println("The number is not palindrome");
	}
}