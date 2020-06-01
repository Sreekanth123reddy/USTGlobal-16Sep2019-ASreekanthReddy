import java.util.Scanner;
class ProductOfNatural
{
	public static void main(String a[])
	{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int product=1,i=1;
	while(i<=n)
	{
	product=product*i;
	i++;
	}
	System.out.println("The product of first :"+n+"natural numbers are:"+product);
	}
}