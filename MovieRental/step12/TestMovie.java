
import junit.framework.*;

public class TestMovie extends TestCase {
	
	static public Movie	m1r = new Movie("Apocalypse Now", Movie.REGULAR);
	static public Movie	m2r = new Movie("Jaws", Movie.REGULAR);
	static public Movie m3c = new Movie("101 Dalmatians", Movie.CHILDRENS);
	static public Movie	m4c = new Movie("Fantasia 2000", Movie.CHILDRENS);
  	static public Movie m5n = new Movie("Dancing in the Dark", Movie.NEW_RELEASE);
  	static public Movie m6n = new Movie("X Men", Movie.NEW_RELEASE);
		
    public void testMovie() {
        Assert.assertTrue("Apocalypse Now"== TestMovie.m1r.getTitle());
        Assert.assertTrue(Movie.REGULAR== TestMovie.m1r.getPriceCode());
        }
        
        
    public void test_getCharge_regular() {
		double days_charge[] = {2.0, 2.0, 2.0, 3.5, 5.0};
	
		for (int days=0; days <=4; days++) {
	  		Rental rental = new Rental(TestMovie.m1r, days);
	  		double res = rental.getMovie().getCharge(rental.getDaysRented());
	  		Assert.assertTrue(res==days_charge[days]);
	  		}
		}

	public void test_getCharge_new_release() {
		double days_charge[]  = {0.0, 3.0, 6.0, 9.0};
	
		for (int days=0; days <=2; days++) {
	  		Rental rental = new Rental(TestMovie.m5n, days);
	  		double res = rental.getMovie().getCharge(rental.getDaysRented());
	  		Assert.assertTrue(res==days_charge[days]);
	  		}
		}

	public void test_getCharge_childrens() {
		double days_charge[]  = {1.5, 1.5, 1.5, 1.5, 3.0, 4.5};
	
		for (int days=0; days <=5; days++) {
	  		Rental rental = new Rental(TestMovie.m3c, days);
	  		double res = rental.getMovie().getCharge(rental.getDaysRented());
	  		Assert.assertTrue(res==days_charge[days]);
	  		}
		}


	public void test_getFrequentRenterPoints() {
		
		double days_points_new_release[]  = {1, 1, 2, 2};	
	
		for (int days=0; days <=3; days++) {
	 		Rental rental = new Rental(TestMovie.m1r, days);
	  		int res = rental.getMovie().getFrequentRenterPoints(rental.getDaysRented());
	  		Assert.assertTrue(res==1);
	  		}
	
		for (int days=0; days <=3; days++) {
	  		Rental rental = new Rental(TestMovie.m5n, days);
	  		int res = rental.getMovie().getFrequentRenterPoints(rental.getDaysRented());
	  		Assert.assertTrue(res==days_points_new_release[days]);
	  		}
	  		
		for (int days=0; days <=3; days++) {
	  		Rental rental = new Rental(TestMovie.m3c, days);
	  		int res = rental.getMovie().getFrequentRenterPoints(rental.getDaysRented());
	  		Assert.assertTrue(res==1);
	  		}
		}




    }

