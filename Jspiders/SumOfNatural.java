import java.util.Scanner;
class SumOfNatural
{
	public static void main(String aa[])
	{
	Scanner in =new Scanner(System.in);
	System.out.println("Ente  number");
	int n=in.nextInt();
	int i=1,sum=0;
	while(i<=n)
	{
	sum=sum+i;
	i++;
	}
	System.out.println("the sum of first :"+n +"natural numbers :"+sum);
	}
}