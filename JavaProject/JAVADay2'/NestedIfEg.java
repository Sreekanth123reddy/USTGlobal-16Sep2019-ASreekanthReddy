class NestedIfEg
{
	public static void main (String aa[])
	{
	char grade = 'B';
	if(grade == 'A')
		System.out.println("FCD");
	else if(grade == 'B')
		System.out.println("FC");
	else if(grade == 'C')
		System.out.println("SC");
	else if(grade == 'D')
		System.out.println("Just Pass");
	else if(grade == 'E')
		System.out.println("Fail");
	else
		System.out.println("Invalid grade");
	}
}