class Pattern27
{
	public static void main(String[] args) {
		int n=9,sp=n/2,st=1;
		for(int i=1;i<=n;i++)
		{

			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int k=1;
			for(int j=1;j<=st;j++)
			{
				if(j%2==0)
					System.out.print("*");
				else
					System.out.print(k++);
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		}
	}
}