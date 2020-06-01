import java.util.Scanner;
class Digits
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		Digit d=new Digit();
		int res=d.sumOfDigits(n);
		System.out.println("Sum of digits :"+res);
		System.out.println("No of digits :"+d.countOfDigits(n));
	}
}
class Digit
{
	int sumOfDigits(int n)
	{
		int sum=0;
		do
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}while(n!=0);
		return sum;
	}
	int countOfDigits(int n)
	{
		int count=0;
		do
		{
			count++;
			n=n/10;
		} while(n!=0);
	return count;
    }

}