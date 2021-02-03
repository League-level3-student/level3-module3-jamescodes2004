package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		//return population*growthRate*(((growthRate-1)/2)+1);
		return population*growthRate*growthRate/2;
	}
	
}
