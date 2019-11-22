class BMI
{
	public static void main(String aa[])
	{
	int weight = 54;
	double height = 1.59;
	double mass = weight / (height*height) ;
	if(mass>=30 && mass <=39.5)
		System.out.println("You are obese range");
	else if(mass>25 && mass<=29.9)
		System.out.println("You are in overweight range");
	else if(mass>18.5 && mass<=24.9)
		System.out.println("You are in healthy weight range");
	else if(mass<18.5)
	System.out.println("You are in the underweight range");
	}
}