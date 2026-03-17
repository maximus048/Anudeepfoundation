package JavaPrograms;
//custom Exception also called as user defined exception
//step: 1.first extends parent class(Exception)
//step 2: initialize exception with custom message  using constructor

class CustomException  extends Exception
{
	CustomException(String str)
	{
		super(str);
	}
}

public class UserDefinedExceptionExample {
	static void agevalidate(int age)throws CustomException
	{
		if(age<18)
		{
			throw new CustomException("age is below 18 ,not eligible for voting" );
		}
		else
		{
			System.out.println(" Candidate  is eligible for voting"); 
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			agevalidate(20);
		}catch(CustomException c)
		{
			System.out.println("user/custom exception");
		}
	}

}
