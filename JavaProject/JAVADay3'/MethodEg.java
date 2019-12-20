class MethodEg
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		double r = 5.7;
		System.out.println("The sum is ->"+sum(a,b));
		System.out.println("The value is ->"+get());
		System.out.println("Area of circle is ->"+areaOfCircle(r));
		System.out.println("The given number is true if itis even otherwise odd " + oddEven(a));
		System.out.println("The factorial:"+factorial(5));
	}
	static  int sum(int x , int y)
	{
	int z = x + y;
	return z;
	}
	static int get()	//we can return lesser datatypes also
	{
	byte p = 10;
	return p;
	}
	static double areaOfCircle(double radius)
	{
		double res = 3.14 * radius * radius ;
		return res;
	}
	static  boolean oddEven(int number)
	{
	if(number%2 ==0)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	static int factorial(int num)
	{	
		int  fact = 1;
		for(int i =1 ;i<=num ;i++)
		{
		fact = fact * i;
		}
		return fact;
	}
	
}