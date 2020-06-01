import java.util.Scanner;
class FindingMonth
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the month number to findout no of days:");
	int mno=in.nextInt();
	if(mno==1)
	System.out.println("January 31 days");
	else if(mno==2)
	System.out.println("February 28 days");
	else if(mno==3)
	System.out.println("March 30");
	else if(mno==4)
	System.out.println("April 31 days");
	else if(mno==5)
	System.out.println("May 30 days");
	else if(mno==6)
	System.out.println("June 31 days");
	else if(mno==7)
	System.out.println("July 30 days");
	else if(mno==8)
	System.out.println("August 31 days");
	else if(mno==9)
	System.out.println("September 30 days");
	else if(mno==10)
	System.out.println("october 31 days");
	else if(mno==11)
	System.out.println("November 30 days");
	else if(mno==12)
	System.out.println("December 31 days");
	else if(mno==0 && mno > 12)
	System.out.println("Not valid month number");
	}
}
