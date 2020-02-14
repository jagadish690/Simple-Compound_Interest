
public class Print {
	public static double power(double a, int b)
	{
		double c = 1;
		for(int i = 0; i < b; i ++)
		{
			c *= a;
		}
		Print(c);
		return c;
	}

	public static void Print(int value) {
		// TODO Auto-generated method stub
		System.out.println(value);
	}
	public static void Print(double value) {
		// TODO Auto-generated method stub
		System.out.println(value);
	}

}
