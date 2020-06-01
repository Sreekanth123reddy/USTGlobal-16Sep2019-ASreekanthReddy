import java.util.Scanner;
class PrimeMethod
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Prime p=new Prime();
		boolean res=p.primeNumber(n);
		if(res==true)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}
}
class Prime
{
	boolean primeNumber(int n)
	{
		int count=1,i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				count++;
			if(count>2)
				break;
			i++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
}