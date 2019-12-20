public class TestA 
{
	public static void add(int a ,int b) 
	{
		System.out.println("add(int a ,int b) method");
	}
//	public static int add(int a ,int b)  Its not possible in method overloading
//	{
//		return a+b;
//	}

	public static void add(byte a ,byte b)
	{
		System.out.println("add(int a ,byte b) method");
	}
	public static long add(long a ,byte b)
	{
		return a+b;
	}
	public static long add(int a ,byte b)
	{
		return a+b;
	}
	public  int multiply(int a ,int b)
	{
		System.out.println("multiply(int a,int b) method");
		return a+b;
	}
	public void multiply(byte a ,int b)
	{
		System.out.println("multiply(byte a,int b) method");
		
	}
	
	
	public static void main(String[] args) 
	{
		TestA t =new TestA();
		t.multiply(2,6);
		t.multiply(1,3);
		add(1, 2);
		add(2, 5);
		add(12343, 3);
		main(10);
	}
	public static void main(int a)
	{
		System.out.println("Main method can also be oveloaded");
	}
}
