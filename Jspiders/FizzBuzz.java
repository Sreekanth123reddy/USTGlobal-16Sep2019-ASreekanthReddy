import java.util.Scanner;
class FizzBuzz
{
	public static void main(String aa[])
	{
	for(int i=0;i<=100;i++)
	{
	if(i%3==0 && i%5==0)
	System.out.println(i +": Fizz and Buzz");
	else if(i%3==0)
	System.out.println(i +": Fizz ");
	else if(i%5==0)
	System.out.println(i +": Buzz");
	}
	}
}   