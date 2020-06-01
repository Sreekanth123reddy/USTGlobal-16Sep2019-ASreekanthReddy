class FirstBigAndSecondBig 
{
	public static void main(String[] args) {
		int a[]={78,23,86,56,35,89};
		int fbig=a[0];
		int sbig=a[1];
		for(int i=1;i<a.length;i++)
		{
		if(a[i]>fbig)
			{
				sbig=fbig;
				fbig=a[i];
			}
		else if(a[i]>sbig) 
			{
			sbig=a[i];
			}	
			
		}
		System.out.println(fbig);
		System.out.println(sbig);
}
}