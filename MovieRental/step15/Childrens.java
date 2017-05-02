
public class Childrens extends Price {
	protected int getPriceCode() {
		return Movie.CHILDRENS;
		}

	@Override
	protected double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3)
			result += (daysRented - 3) * 1.5;
		return result;
	}
	}