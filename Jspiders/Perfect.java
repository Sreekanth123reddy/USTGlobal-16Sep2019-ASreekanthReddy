import java.util.Scanner;
class Perfect
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		PerfectNumber pn=new PerfectNumber();
		boolean res=pn.isPerfectNumber(n);
		if(res==true)
			System.out.println("Perfect Number");
		else
			System.out.println("Not Perfect Number");

	}
}
class PerfectNumber
{
	boolean isPerfectNumber(int n)
	{
		int sum=0,i=1;
		while(i<=n/2)
		{
			if(n%i==0)
			sum=sum+i;
			i++;
		}
		if(sum==n)
			return true;
		else
			return false;
	}	
}