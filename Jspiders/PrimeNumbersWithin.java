class PrimeNumbersWithin
{
	public static void main(String[] args) {
		Prime p=new Prime();
		for(int i=0;i<100;i++)
		{
		boolean res=p.primeNumber(i);
		if(res==true)
			System.out.println(i);
		}
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