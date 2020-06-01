import java.util.Scanner;
class LeapYearOrNot
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the yaer");
	int year=in.nextInt();
	if(year%400==0)
	System.out.println(year+" Year is leap year");
	else if(year%4==0 && year%100!=0)
	System.out.println(year+" Year is  leap year");
	else
	System.out.println(year+" Year is not a leap year");
	}
}