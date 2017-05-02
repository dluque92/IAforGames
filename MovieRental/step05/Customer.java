import java.util.Vector;
import java.util.Enumeration;

public class Customer {

	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String statement() {
		double totalAmount = 0;
		int totalFrequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "--\nRental Record for " +  getName() + "\n";
		while (rentals.hasMoreElements()) {

			Rental each = rentals.nextElement();

			// add frequent renter points
			int frequentRenterPoints = 1;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
				each.getDaysRented() > 1) frequentRenterPoints ++;

			//show figures for this rental
			result += "\t" + each.getDaysRented() +
				"\t" + each.getMovie().getTitle() +
				"\t" + String.valueOf(each.getCharge()) + "\n";
			totalAmount += each.getCharge();
			totalFrequentRenterPoints += frequentRenterPoints;
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " +  String.valueOf(totalFrequentRenterPoints) +
			" frequent renter points\n";
		return result;

	}

}

