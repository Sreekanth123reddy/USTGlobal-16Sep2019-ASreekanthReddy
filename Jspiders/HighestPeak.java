class HighestPeak
{
	public static void main(String[] args) {
		int a[]={23,45,56,78,89,35};
		System.out.println("Highest Peak is"+highesPeak(a));
}
	static int highesPeak(int a[])
		{
			int hp=-1;

			for(int i=1;i<a.length-1;i++)
			{
				if(a[i]>a[i-1]&&a[i]>a[i+1])
				{
					if(hp<a[i])
						hp=a[i];
				}
			}
		return hp;
		}
}
