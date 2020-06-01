class BinaryToDecimal
{
	public static void main(String[] args) {
			Binary b=new Binary();
			System.out.println(b.binToDec(111));
		}	
}
class Binary
{
	int sum=0,r=2, p=0;;
	int binToDec(int bin)
	{
		
		do{
		int rem=bin%10;
		sum=sum+rem*pow(2,p);
		bin=bin/10;
		p++;
	}
	while(bin!=0);
	return sum;
}
int pow(int n,int r)
{
	int pw=1;
	while(r>0)
	{
		pw=pw*r;
		r--;
	}
return pw;
}

}

