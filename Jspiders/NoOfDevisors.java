import java.util.Scanner;
class NoOfDevisors
{
	public static void main(String aa[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		PassedDevisors pd=new PassedDevisors();
		int re=pd.passed(n);
		System.out.println(re);
	}	
}
class PassedDevisors
{
	int passed(int n)
	{
		int count=0,i=1;
		while(i<=n)
		{
			if(n%i==0)
		
			count++;
			i++;
		
		}
		return count;
	}
}