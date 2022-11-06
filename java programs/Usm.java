class Usm
{
	public static void main(String[] args) 
	
	{
		try
		{
			System.out.println("try block executed");
			return;
		}
		catch(ArithmaticException e)
		{
			System.out.println("catch block executed");
		}
		finally
		{
		System.out.println("finally block executed");
		}
	}

}