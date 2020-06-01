import java.util.Scanner;
class ProductOfNdivisors
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int i=1,product=1;
	while(i<=num)
	{
	if(num%i==0)
	
	product=product*i;
	i++;
	}
	System.out.println(product);	
	}
}