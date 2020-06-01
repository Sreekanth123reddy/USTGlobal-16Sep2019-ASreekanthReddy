import java.util.*;
class DayFinder
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date(dd MM YYYY)format ");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		int days=dd;
		int y=yy-1;
		days=days+y*365;
		days=days+(y/400+y/4-y/100);
		int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(yy%400==0||yy%4==0&&yy%100!=0)
			month[2]=29;
		for(int i=0;i<mm;i++)
		{
			days=days+month[i];
		}
		String dname[]={"sunday","monday","tuesday","wednesday","Thursday","friday","saturday"};
		int r=days%7;
		System.out.println(dname[r]);
	}
}