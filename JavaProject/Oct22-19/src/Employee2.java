public class Employee2 
{
	String name;
	int eid;
	long aadharNo;
	
	Employee2(String name,int eid,long aadharNo)
	{
		this.name =name;
		this.eid =eid;
		this.aadharNo =aadharNo;
	}
	Employee2(String name , int eid){
		this.name =name;
		this.eid=eid;
	}
	Employee2(int eid ,String name)
	{
		this.eid = eid;
		this.name =name;
	}
	void printDetails()
	{
		System.out.println("Hi "+ name + " welcome to ust global");
	}
}
