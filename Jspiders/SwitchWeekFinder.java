import java.util.Scanner;
class SwitchWeekFinder
{
	public static void main(String aa[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter day number:");
	int num=in.nextInt();
	switch(num)
	{
	case 0 :System.out.println("Sunday");
		break;	
	case 1 :System.out.println("Monday");
		break;
	case 3 :System.out.println("Tuesday");
		break;
	case 4 :System.out.println("Wednesday");
		break;
	case 5 :System.out.println("Thursday");
		break;
	case 6 :System.out.println("Friday");
		break;
	case 7 :System.out.println("Saturday");
		break;
	default : System.out.println("Not a valid date");
	}
	}
}