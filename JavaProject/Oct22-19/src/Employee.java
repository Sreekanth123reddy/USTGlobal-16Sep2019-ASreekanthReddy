public class Employee 
{
	String name;
	int eid;
	
	public Employee(String empname ,int empid)
	{
		name = empname;
		eid = empid;
	}
	void printDetails()
	{
		System.out.println("Employee name =>"+name);
		System.out.println("Employeee is is = >" +eid);
	}
	
	public static void main(String[] args) {
		Employee e1 =new Employee("Rashi Khanna" ,4098);
		e1.printDetails();
	
		Employee e2= new Employee("Dainiell Rousle",4088);
		e2.printDetails();
		Employee e3= new Employee("Ian Somerholder" ,4087);
		e3.printDetails();
	}
}
