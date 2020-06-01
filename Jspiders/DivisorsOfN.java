import java.util.Scanner;
class DivisorsOfN
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=in.nextInt();
	int i=1;
	while(i<=n)
	{
	if(n%i==0)
	System.out.println("The devisor :"+i);
	i++;
	}
	}

}