import java.util.Scanner;
class CheckTwonumbershavingSameSum
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter two numbers:");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int sum=0,sum1=0;
	do
	{
	int rem=a%10;
	sum=sum+rem;
	a=a/10;
	}while(a!=0);
	do
	{
	int rem=b%10;
	sum1=sum1+rem;
	b=b/10;
	}while(b!=0);
	if(sum==sum1)
	System.out.println("Both having sum of digits  equal");
	else
	System.out.println("NOt having same sum of digits");
	}
}