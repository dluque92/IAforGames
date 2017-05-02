
abstract public class Price {
	abstract int getPriceCode();

	double getCharge(int daysRented) {
		//determine amounts for each line
		double result = 0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (daysRented > 2)
					result += (daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += daysRented * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (daysRented > 3)
					result += (daysRented - 3) * 1.5;
				break;
		}
		return result;
	}

	int getFrequentRenterPoints(int daysRented) {
		// add frequent renter points
		int result = 1;
		// add bonus for a two day new release rental
		if ((getPriceCode() == Movie.NEW_RELEASE) &&
			daysRented > 1) result ++;
		return result;
	}
}
	


