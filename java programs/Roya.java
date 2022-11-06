class Roya
{
	public static void main(String[]args) 
	
		{
			System.out.println(m1());
		}
		public static intm1()
		{
			try
		{
			System.out.println("10/0");
			return777;
		}
		catch(ArithmeticException e)
		{
		return888;
		}
		finally
		{
			return999;
		}
	}

}