import java.util.Scanner;
class Strong
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		StrongMethod sm=new StrongMethod();
		boolean res=sm.isStrongNumber(n);
		if(res==true)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");

	}
}
class StrongMethod
{
	boolean isStrongNumber(int n)
	{
		int sum=0,t=n;
		do
		{
			int rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}while(n!=0);
	
	if(sum==t)
		return true;
	else
		return false;
	}
	int fact(int r)
	{
		int f=1;
		while(r>1)
		{
			f=f*r;
			r--;
		}
		return f;
	}
}
