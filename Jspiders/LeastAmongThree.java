import java.util.Scanner;
class LeastAmongThree
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();	
	int result=(a<b && a<c)? a:(b<c)?b:c;
	System.out.println("The smallest number is:"+result);
	}
}