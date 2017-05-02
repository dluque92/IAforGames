import junit.framework.*;

public class TestCustomer extends TestCase {

	  	    Customer adams, jones, smith, zero;
	  	    
	  	    Movie m1r, m2r, m3c, m4c, m5n, m6n;
	
	  protected void setUp() {

 			adams = new Customer("Adams");	  	
 			jones = new Customer("Jones");
 			smith = new Customer("Smith");
 			zero  = new Customer("Zero");
 			
	  	    m1r = new Movie("Apocalypse Now", Movie.REGULAR);
	  	    m2r = new Movie("Jaws", Movie.REGULAR);
	  	    m3c = new Movie("101 Dalmatians", Movie.CHILDRENS);
	  	    m4c = new Movie("Fantasia 2000", Movie.CHILDRENS);
  	        m5n = new Movie("Dancing in the Dark", Movie.NEW_RELEASE);
  	        m6n = new Movie("X Men", Movie.NEW_RELEASE);
  	        }
  	        
  	  public void testCustomer() {
  	  	    Assert.assertTrue("Adams" == adams.getName());
  	  	    }
  	  	    
  	  public void testStatement1() {

	  	    String stAdams = "--\nRental Record for Adams\n\t3\tJaws\t3.5\n\t2\tFantasia 2000\t1.5\n\t1\tX Men\t3.0\nAmount owed is 8.0\nYou earned 3 frequent renter points\n";

  	  	    adams.addRental(new Rental(m2r, 3));
  	  	    adams.addRental(new Rental(m4c, 2));
  	  	    adams.addRental(new Rental(m6n, 1));
  	  	    Assert.assertTrue(adams.statement().equals(stAdams));
  	  	    }
  	  	    
  	  public void testStatement2() {

	  	    String stJones = "--\nRental Record for Jones\n\t2\tApocalypse Now\t2.0\n\t4\t101 Dalmatians\t3.0\n\t6\tDancing in the Dark\t18.0\nAmount owed is 23.0\nYou earned 4 frequent renter points\n";

  	  	    jones.addRental(new Rental(m1r, 2));
  	  	    jones.addRental(new Rental(m3c, 4));
  	  	    jones.addRental(new Rental(m5n, 6));
  	  	    Assert.assertTrue(jones.statement().equals(stJones));
  	  	    }
  	  	   
  	  public void testStatement3() {

	  	    String stSmith = "--\nRental Record for Smith\n\t1\tApocalypse Now\t2.0\n\t4\tJaws\t5.0\n\t1\t101 Dalmatians\t1.5\n\t4\tFantasia 2000\t3.0\n\t1\tDancing in the Dark\t3.0\n\t4\tX Men\t12.0\nAmount owed is 26.5\nYou earned 7 frequent renter points\n";
	
  	  	    smith.addRental(new Rental(m1r, 1));
  	  	    smith.addRental(new Rental(m2r, 4));
  	  	    smith.addRental(new Rental(m3c, 1));
  	  	    smith.addRental(new Rental(m4c, 4));
  	  	    smith.addRental(new Rental(m5n, 1));
  	  	    smith.addRental(new Rental(m6n, 4));
			Assert.assertTrue(smith.statement().equals(stSmith));
		}
			
	  public void testStatement0() {

			String stZero = "--\nRental Record for Zero\nAmount owed is 0.0\nYou earned 0 frequent renter points\n";
	
	  	    Assert.assertTrue(zero.statement().equals(stZero));
	  	    }
     
        }