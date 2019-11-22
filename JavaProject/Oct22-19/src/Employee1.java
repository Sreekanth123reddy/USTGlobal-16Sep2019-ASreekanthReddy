public class Employee1 {
	String name;
	int eid;
	
	public Employee1(String name ,int eid)
	{
		this.name = name;
		this.eid = eid;
	}
	void printDetails()
	{
		System.out.println("Employee name =>"+name);
		System.out.println("Employeee is is = >" +eid);
	}
	void sayHello() {
		System.out.println("Hello "+name+"Welcome to ust global company");
	}
	
	public static void main(String[] args) {
		Employee1 e1 =new Employee1("Rashi Khanna" ,4098);
		e1.printDetails();
		e1.sayHello();
		Employee1 e2 =new Employee1("Rashi" ,4008);
		e1.printDetails();
		e2.sayHello();
}
}