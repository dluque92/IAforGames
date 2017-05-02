
public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;
	private Price _priceCode;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return _priceCode.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
			case REGULAR :
				_priceCode = new Regular();
				break;
			case CHILDRENS:
				_priceCode = new Childrens();
				break;
			case NEW_RELEASE:
				_priceCode = new NewRelease();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

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

