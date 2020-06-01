class PerfectNumberWithIn100
{
	public static void main(String[] args) {
		PerfectMethod pm=new PerfectMethod();
		int sum=0;
		for(int i=0;i<=100;i++)
		{

			boolean res=pm.Perfect(i);
			if(res==true)
				sum=sum+i;
			}
			System.out.println("The sum Of perfect numbers with in 100 :"+sum);
	}
}
class PerfectMethod
{
	boolean Perfect(int n)
	{
		int sum=0,i=1;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==n)
			return true;
		else
			return false;

	}



}