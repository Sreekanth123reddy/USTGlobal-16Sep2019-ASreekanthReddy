import java.util.Scanner;
class LeapYearOrNot1
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the yaer");
	int year=in.nextInt();
	if(year%400==0 || (year%4==0 && year%100!=0)) // let 2016 2016%4==16(False) || (2016%4==0 ,2016%100=16)( True) => T||F=T
	System.out.println(year+" Year is leap year");
	else
	System.out.println(year+" Year is not a leap year");
	}
}