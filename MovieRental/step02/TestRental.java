import junit.framework.*;

public class TestRental extends TestCase {

    public void testRental() {
        Movie movie = new Movie("Apocalypse Now",Movie.REGULAR);
        Rental rental = new Rental(movie, 7);
        Assert.assertTrue(movie==rental.getMovie());
        Assert.assertTrue(7==rental.getDaysRented());
        }
    }