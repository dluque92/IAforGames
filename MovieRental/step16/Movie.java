
public class Movie {

	public static final Price CHILDRENS = new Childrens();
	public static final Price REGULAR = new Regular();
	public static final Price NEW_RELEASE = new NewRelease();

	private String _title;
	private Price _priceCode;

	public Movie(String title, Price priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public Price getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(Price arg) {
		_priceCode = arg;	}

	public String getTitle() {
		return _title;
	}

	double getCharge(int daysRented) {
		return _priceCode.getCharge(daysRented);
	}

	int getFrequentRenterPoints(int daysRented) {
		return _priceCode.getFrequentRenterPoints(daysRented);
	}
}

