public class TestE 
{
	public static void main(String[] args) 
	{
		Student.universityName = "KLUniversity";
		Student s1 = new Student();
		s1.name = "A Sreekanth Reddy";
		s1.registerNumber = 9915004098L;
		System.out.println("College name is "+Student.universityName);
		System.out.println("Name is "+s1.name);
		System.out.println("Register number  "+s1.registerNumber);
	}
}
