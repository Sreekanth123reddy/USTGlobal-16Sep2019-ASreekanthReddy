import java.util.Scanner;
class PerfectNumber
{
	public static void main(String a[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number to check perfect number:");
	int num=in.nextInt();
	int i=1,sum=0;
	while(i<=num/2)
	{
	if(num%i==0)
	sum=sum+i;
	i++;
	}
	if(sum==num)
	System.out.println(num+" Is perfect number");
	else
	System.out.println(num +" Is not perfect number");
	}
}