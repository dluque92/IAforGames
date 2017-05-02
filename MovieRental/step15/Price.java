
abstract public class Price {
	
	protected abstract int getPriceCode();

	protected abstract double getCharge(int daysRented);

	int getFrequentRenterPoints(int daysRented) {
		// add frequent renter points
		return 1;
	}
}
	


