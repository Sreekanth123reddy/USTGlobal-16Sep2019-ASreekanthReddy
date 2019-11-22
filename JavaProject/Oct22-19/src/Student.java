public class Student 
{
	long registerNumber;
	String name;
	String dept;
	int age;
	long phoneNumber;
	
	Student(long rn ,String sname ,String deptname , int sage ,long spn)
	{
		this.registerNumber = rn;
		this.name = sname;
		this.dept = deptname;
		this.age = sage;
		this.phoneNumber = spn;
	}
	void printDetails()
	{
		System.out.println("Register Number is "+ registerNumber);
		System.out.println("Student Name" +name);
		System.out.println("Department "+dept);
		System.out.println("age is "+age);
		System.out.println("phone number"+phoneNumber);
	}
	public static void main(String[] args) {
		Student s1 =new Student(9915004098L, "A Sreekanth Reddy", "CSE", 22, 8374036361L);
		s1.printDetails();
		Student s2 =new Student(9915004097L, "K KAvitha", "CSE", 22, 8654516623L);
		s2.printDetails();
		Student s3 =new Student(9915004099L, "Reddy Rani", "ECE", 22, 837098761L);
		s3.printDetails();
		Student s4 =new Student(9915004120L, "G Gayathri", "CSE", 21, 7092122352L);
		s4.printDetails();
		
	}
}
