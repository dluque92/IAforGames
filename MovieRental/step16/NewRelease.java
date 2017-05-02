

public class NewRelease extends Price {
	protected Price getPriceCode() {	
		return Movie.NEW_RELEASE;
		}

	@Override
	protected double getCharge(int daysRented) {
		//determine amounts for each line
		return (double) (daysRented * 3);
	}


	@Override
	protected int getFrequentRenterPoints(int daysRented) {
		// add bonus for a two day new release rental
		if (daysRented > 1) return 2;
		else return 1;
	}
}
	
