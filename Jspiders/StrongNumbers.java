class StrongNumbers
{
	public static void main(String[] args) {

		StrongMethod sm=new StrongMethod();
		for(int i=1;i<=100000;i++)
		{
			boolean res=sm.isStrongNumber(i);
			if(res==true)
				System.out.println(i);
		}
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
