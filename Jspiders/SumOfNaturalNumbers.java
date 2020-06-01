import java.util.Scanner;
class SumOfNaturalNumbers
{
	public static void main(String aa[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		NaturalNumber pd=new NaturalNumber();
		int re=pd.sum(n);
		System.out.println(re);
	}	
}
class NaturalNumber
{
	int sum(int n)
	{
		int i=0,sum=0;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		return sum;
	}
}