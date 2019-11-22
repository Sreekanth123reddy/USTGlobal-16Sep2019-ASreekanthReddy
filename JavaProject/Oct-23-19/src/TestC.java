public class TestC 
{
	
	void add() {
		System.out.println("   ");
	}
	void add(int a) {
		System.out.println("  ");
	}
	void add(int a , byte w , String c) {
		
	}
void add( byte w , String c , int a) {
		
	}
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		sup.count();
		System.out.println("==========================");
		SubClass sub = new SubClass();
		sub.count();
		System.out.println("====================");
	}
}
