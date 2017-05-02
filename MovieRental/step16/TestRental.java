
import junit.framework.*;

public class TestRental extends TestCase {
	
    public void testRental() {
        Rental rental = new Rental(TestMovie.m1r, 7);
        Assert.assertTrue(TestMovie.m1r==rental.getMovie());
        Assert.assertTrue(7==rental.getDaysRented());
        }
    
    }
	