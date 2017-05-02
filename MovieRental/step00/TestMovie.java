import junit.framework.*;

public class TestMovie extends TestCase {
    
    public void testMovie() {
        Movie movie = new Movie("Apocalypse Now",Movie.REGULAR);
        Assert.assertTrue("Apocalypse Now"==movie.getTitle());
        Assert.assertTrue(Movie.REGULAR==movie.getPriceCode());
        }
    }

