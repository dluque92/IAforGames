

import junit.framework.*;

public class TestRental extends TestCase {
	
    public void testRental() {
        Rental rental = new Rental(TestMovie.m1r, 7);
        Assert.assertTrue(TestMovie.m1r==rental.getMovie());
        Assert.assertTrue(7==rental.getDaysRented());
        }
    
	public void test_getFrequentRenterPoints() {
		
		double days_points_new_release[]  = {1, 1, 2, 2};	
	
		for (int days=0; days <=3; days++) {
	 		Rental rental = new Rental(TestMovie.m1r, days);
	  		int res = rental.getFrequentRenterPoints();
	  		Assert.assertTrue(res==1);
	  		}
	
		for (int days=0; days <=3; days++) {
	  		Rental rental = new Rental(TestMovie.m5n, days);
	  		int res = rental.getFrequentRenterPoints();
	  		Assert.assertTrue(res==days_points_new_release[days]);
	  		}
	  		
		for (int days=0; days <=3; days++) {
	  		Rental rental = new Rental(TestMovie.m3c, days);
	  		int res = rental.getFrequentRenterPoints();
	  		Assert.assertTrue(res==1);
	  		}
		}

    }
	