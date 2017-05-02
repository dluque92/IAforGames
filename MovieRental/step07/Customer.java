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
		int totalFrequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "--\nRental Record for " +  getName() + "\n";
		while (rentals.hasMoreElements()) {

			Rental each = rentals.nextElement();

			//show figures for this rental
			result += "\t" + each.getDaysRented() +
				"\t" + each.getMovie().getTitle() +
				"\t" + String.valueOf(each.getCharge()) + "\n";
			totalFrequentRenterPoints += each.getFrequentRenterPoints();
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
		result += "You earned " +  String.valueOf(totalFrequentRenterPoints) +
			" frequent renter points\n";
		return result;

	}

	private double getTotalAmount() {
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {

			Rental each = rentals.nextElement();

			result += each.getCharge();
		}
		return result;

	}
}

