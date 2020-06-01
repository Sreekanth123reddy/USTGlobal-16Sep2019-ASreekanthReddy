class HappyNumber
{
	public static void main(String[] args) {
		Happy h=new Happy();
		for(int i=0;i<=1000;i++)
		{
		boolean res=h.isHappy(i);
		if(res==true)
		System.out.println(i);
		}
	}
}
class Happy
{
	boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			do
			{
				int rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
			}while(n!=0);
		n=sum;
		}
		
	return n==1||n==7 ;
	}
		

}