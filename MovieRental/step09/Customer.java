
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
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "--\nRental Record for " +  getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();

			//show figures for this rental
			result += "\t" + each.getDaysRented() +
				"\t" + each.getMovie().getTitle() +
				"\t" + String.valueOf(each.getCharge()) + "\n";
		}
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " +  String.valueOf(getTotalFrequentRenterPoints()) +
			" frequent renter points\n";
		return result;

	}
	
	
	public String htmlStatement() {
		Enumeration<Rental> rentals = _rentals.elements();
		
		String result = "<H1>Rental Record for " +  getName() + "</H1>\n";
               result += "<TABLE BORDER=\"1\">\n";
               result += "<TR><TH>Days<TH>Title<TH>Charge\n";
               
        while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();

			//show figures for this rental
			result += "<TR><TD>" + each.getDaysRented() + 
			              "<TD>" + each.getMovie().getTitle() + 
			              "<TD>" + each.getCharge() + "\n";
		}
        result += "</TABLE>\n";
		//add footer lines
		result += "<P>Amount owed is <B>" + String.valueOf(getTotalCharge()) + "</B></P>\n";
		result += "<P>You earned <B>" +  String.valueOf(getTotalFrequentRenterPoints()) +
			"</B> frequent renter points</P>\n";
		return result;

	}

	public double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	public int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;

	}

}

