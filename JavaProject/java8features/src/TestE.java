import java.util.function.Supplier;

import com.ustglobal.java8features.Student;

public class TestE {
public static void main(String[] args) {
	Supplier<Student> s = () -> new Student(2,"Ajay",65.6); 
		Student s1 = s.get();
		System.out.println("Id is "+s1.id);
		System.out.println("Name is :"+s1.name);
		System.out.println("PErcentage is :"+s1.percentage);
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println("Value is "+val);
		
		Supplier<String> sp = ()->"Good Evening";
		String v = sp.get();
		System.out.println("Value "+v);
		
}
}
