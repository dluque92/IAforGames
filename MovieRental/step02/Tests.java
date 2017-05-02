import junit.framework.*;

public class Tests extends TestCase {
	
	public static Test suite() { 
    	TestSuite suite= new TestSuite(); 
    	suite.addTest(new TestSuite(TestMovie.class));
    	suite.addTest(new TestSuite(TestRental.class));
    	suite.addTest(new TestSuite(TestCustomer.class));
    		 
    	return suite;
		}
   	}
      
        