import java.util.Scanner;
class PowerMethod
{
	static int power(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

	public static void main(String[] args) {
		int p1=power(5,4);
		System.out.println(p1);
		System.out.println(power(2,4));
		}
}


	
