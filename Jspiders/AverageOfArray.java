import java.util.Scanner;
class AverageOfArray
{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of elements");
			int n=sc.nextInt();
			int ar[]=new int[n];
			System.out.println("Enter "+n+"values");
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter"+(i+1)+"value");
				ar[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<n;i++)
			{
			sum=sum+ar[i];
			}
			System.out.println("The average of"+n+"number is"+(sum/n));
		}	
}