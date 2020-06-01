class Pattern25
{
	public static void main(String[] args) {
			int n=7;
			for(int i=1;i<=n;i++)
			{
				int k=i;
				for(int j=0;j<=i;j++)
				{
					System.out.print(" ");
				}

				for(int j=1;j<=n;j++)
				{
					System.out.print(k+" ");
					k=k+(n-j);
				}
				System.out.println();
			}


		}	
}