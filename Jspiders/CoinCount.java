import java.util.Scanner;
class CoinCount
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int fc=n/5; // 13/5=2
	System.out.println("no of 5 rs coins"+fc);
	int tc=n%5/2; //13%5/2 =>3/2=>1
	System.out.println("no of 2 rs coins"+tc);
	int oc=n%5%2; //13%5%2=>3%2=>1
	System.out.println("no of 1 rs coins"+oc);
	System.out.println("total no  coins"+(fc+tc+oc));
	}
}