package EPAM.InterestCalculation;

/**
 * Hello world!
 *
 */
interface Interest{
	double simpleInterest(double principleAmount,double rate,double timeInYears);
	double compoundInterest(double principleAmount,double rate,double timeInYears);
}
class CaluclateInterest implements Interest{
	public double simpleInterest(double principleAmount,double rate,double timeInYears) {
		double simpleInterest=(principleAmount*timeInYears*rate)/100;
		return simpleInterest;
	}

	public double compoundInterest(double principleAmount,double rate,double timeInYears) {
		double CompoundInterest = principleAmount * 
                (Math.pow((1 + rate / 100), timeInYears)); 
		return CompoundInterest;
	}
}
