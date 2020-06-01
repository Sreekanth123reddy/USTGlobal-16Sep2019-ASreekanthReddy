class LowestPeak
{
	public static void main(String[] args) {
		int a[]={23,45,56,78,89,35,83,56};
		System.out.println("lowestPeak is"+lowestPeak(a));
}
	static int lowestPeak(int a[])
		{
			int hp=-1;

			for(int i=1;i<a.length-1;i++)
			{
				if(a[i]>a[i-1]&&a[i]>a[i+1])
				{
					if(hp>a[i] || hp==-1)
						hp=a[i];
				}
			}
		return hp;
		}
}
