class PrimeNumbersWithin100
{
	public static void main(String aa[])
	{
	int n=0;
	while(++n<100)
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
	System.out.println(n+" is prime");
	}
	}
}
