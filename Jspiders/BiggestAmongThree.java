import java.util.Scanner;
class BiggestAmongThree
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
	if(a>b&&a>c)
	System.out.println("a is biggest number:");
	else if(b>c)
	System.out.println("b is biggest:");
	else
	System.out.println("C is biggest:");
	}
}