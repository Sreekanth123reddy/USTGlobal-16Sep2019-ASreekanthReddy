class  MultipleOf3
{
	public static void main(String aa[])
	{
	int i=1,count=0;
	while(i<=100)
	{
	if(i%3==0)
	count++;
	i++;
	}
	System.out.println("the number of 3 divisors in 100 are:"+count);
	}
}