class LeapYearWithin2009
{
	public static void main(String a[])
	{
	int i=1,count=0;
	while(i<=2019)
	{
	if(i%400==0 || i%4==0 && i%100!=0) // or n/4-n/100+n/400 is the logic for no of leap years with in n
	count++;
	i++;
	}
	System.out.println("In 2019 "+count+"leap years");
	}
}