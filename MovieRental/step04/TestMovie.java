

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
        
    }

