import java.util.Scanner;
class SanjuWedsGeetha
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	int sNo=in.nextInt();
	if(sNo%3==0)
	System.out.println("SANJU");
	if(sNo%5==0)
	System.out.println("Geetha");
	if(sNo%3==0 && sNo%5==0)
	System.out.println("SANJU weds GEETHA");
	else
	System.out.println("BREAK UP");
	}
}