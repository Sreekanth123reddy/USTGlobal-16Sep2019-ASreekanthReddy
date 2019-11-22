public class TestC 
{
	 TestC()
	{
		System.out.println("Test Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main started");
		TestC t = new TestC();
		//t.TestC(); not possible
		
		System.out.println("main ended");
	}
}
