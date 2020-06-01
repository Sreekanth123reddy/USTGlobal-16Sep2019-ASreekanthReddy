import java.util.Scanner;
class StudentPercentageCal
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the four subject marks:");
	int sub1=scan.nextInt();
	int sub2=scan.nextInt();
	int sub3=scan.nextInt();
	int sub4=scan.nextInt();
	if(sub1<35 || sub2<35 || sub3<35 || sub4<35) //not needed to check all conditions
		System.out.println("Result: Fail");
	else
		{
		double per=(sub1+sub2+sub3+sub4)/4.0; //percentage calculation
		if(per>=85)
			System.out.println("Result:Distinction");
		else if(per>=60)
			System.out.println("Result:Firstclass");
		else if(per>=50)
			System.out.println("Result:Second Class");
		else
			System.out.println("Result:Pass");		
		}

	
	}
}
