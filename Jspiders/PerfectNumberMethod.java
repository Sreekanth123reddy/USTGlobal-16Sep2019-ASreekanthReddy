class PerfectNumberMethod
{
	public static void main(String[] args) {
		PerfectMethod pm=new PerfectMethod();
		for(int i=0;i<=1000;i++)
		{

			boolean res=pm.Perfect(i);
			if(res==true)
				System.out.println(i+"  is Perfect number");
		
		}
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