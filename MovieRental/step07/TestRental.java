

import junit.framework.*;

public class TestRental extends TestCase {
	
    public void testRental() {
        Rental rental = new Rental(TestMovie.m1r, 7);
        Assert.assertTrue(TestMovie.m1r==rental.getMovie());
        Assert.assertTrue(7==rental.getDaysRented());
        }
    
	public void test_getCharge_regular() {
		double days_charge[] = {2.0, 2.0, 2.0, 3.5, 5.0};
	
		for (int days=0; days <=4; days++) {
	  		Rental rental = new Rental(TestMovie.m1r, days);
	  		double res = rental.getCharge();
	  		Assert.assertTrue(res==days_charge[days]);
	  		}
		}

	public void test_getCharge_new_release() {
		double days_charge[]  = {0.0, 3.0, 6.0, 9.0};
	
		for (int days=0; days <=2; days++) {
	  		Rental rental = new Rental(TestMovie.m5n, days);
	  		double res = rental.getCharge();
	  		Assert.assertTrue(res==days_charge[days]);
	  		}
		}

	public void test_getCharge_childrens() {
		double days_charge[]  = {1.5, 1.5, 1.5, 1.5, 3.0, 4.5};
	
		for (int days=0; days <=5; days++) {
	  		Rental rental = new Rental(TestMovie.m3c, days);
	  		double res = rental.getCharge();
	  		Assert.assertTrue(res==days_charge[days]);
	  		}
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
	