import java.util.Scanner;
class LiftAndLoad
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of people:");
		int n=in.nextInt();
		if(n>9)
			System.out.println("Overload");
		else
		{
			double weight=0;
			double w[]=new double[n];
			for(int i=0;i<n;i++)
				{
				System.out.println("Enter weight of"+(i+1)+"person");
				w[i]=in.nextDouble();
				weight=weight+w[i];
				}
				if(weight>750)
					System.out.println("Lift is overloaded");
				else
				
					System.out.println("Lift is working");

				
		}
	}
}
