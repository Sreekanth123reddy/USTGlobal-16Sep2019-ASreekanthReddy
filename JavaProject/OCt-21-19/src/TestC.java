public class TestC 
{
	public static void main(String[] args) 
	{
		Person.color ="white";
		Person.sleep();
		System.out.println("Person color "+Person.color);
		//Person.age = 20;
		Person p = new Person();
		p.age = 20;
		p.name = "sreekanth reddy";
		System.out.println("person age "+p.age+"  person name"+p.name);
		//p.color ="black"; -> we should not access static variables in non-static manner
		
	}
}
