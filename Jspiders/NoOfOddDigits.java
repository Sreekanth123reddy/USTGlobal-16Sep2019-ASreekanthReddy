import java.util.Scanner;
class NoOfOddDigits
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int count=0,res;
	while(n>0)
	{
	int rem=n%10;
	if(rem%2!=0)
	count++;
	n=n/10;
	}
	System.out.println("No of odd digits:"+count);
	}
}