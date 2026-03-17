/*
2.Create program for Custom Exception.

Code:
package Practice;

class CustomException  extends Exception
{
	CustomException(String str)
	{
		super(str);
	}

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
			agevalidate(10);
		}catch(CustomException c)
		{
			System.out.println("user/custom exception");
		}
	}

}

OutPut:
user/custom exception

*/