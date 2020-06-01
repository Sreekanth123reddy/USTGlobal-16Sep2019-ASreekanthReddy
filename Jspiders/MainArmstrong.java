class MainArmstrong
{
	public static void main(String[] args) {
	DisariumCheck dc=new DisariumCheck();
	for(int i=0;i<=10000;i++)
	{
		boolean rs=dc.isArmstrong(i);
		if(rs==true)
			System.out.println(i);
	}		


	}
}
class DisariumCheck
{	
	int count=0;
	boolean isArmstrong(int n)
	{
		int c=countOFDigits(n);
		int sum=0,t=n;
		do
		{
			int rem=n%10;
			sum=sum+pow(rem,c);
			n=n/10;
		}while(n!=0);
		return sum==t;
	}

	int countOFDigits(int x)
	{
		int count=0;
			do
			{
				count++;
				x=x/10;
				
			} while(x!=0);
		return count;
	}
	int pow(int rem,int c)
	{
		int pw=1;
		while(c>0)
		{
			pw=pw*rem;
			c--;
		}
		return pw;
	}
}
