import java.util.Scanner;
class StrongNumber
{
	public static void main(String aa[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number to check strong or not");
	int n=scan.nextInt();
	int t=n,sum=0;
	while(n>0)
	{
	int rem=n%10;
	int i=1,fact=1;
	while(i<=rem) //while(rem>1)
	{		//{
	fact=i*fact;	//fact=fact*rem;
	i++;		//rem--;
	}
	sum=sum+fact;
	n=n/10;		
	}
	
	if(t==sum)
	System.out.println("Strong number");
	else
	System.out.println("Not strong number");
	
	}

}