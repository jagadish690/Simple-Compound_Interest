
public class CompoudInterest extends SimpleInterest {

	public static void CompoudInterest(int principal, int rate_of_interest, int time)  {
		// TODO Auto-generated method stub
		double Compound_Interest = 0;
		double k =(1 + rate_of_interest);
		double o = power(k, time);
		Compound_Interest =(principal) * (o) - principal;
		Print(Compound_Interest);
	}

}
