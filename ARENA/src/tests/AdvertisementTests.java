package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import domain.advertisements.AdvApplicationStatus;
import domain.advertisements.AdvLocation;
import domain.advertisements.AdvScheme;
import domain.advertisements.AdvSchemeManager;
import domain.advertisements.Advertisement;
import domain.advertisements.FrontAdvLocation;

public class AdvertisementTests {

	
	@Test
	public void cantDefineAdvSchemeForALocationThatHasNotExpired() {
		//AdvLocation advLocation = new AdvLocation();
		
		// input data
		
		//Date start = new SimpleDateFormat("MM/dd/yyy").parse("12/05/2014");
		//Date end   = new SimpleDateFormat("MM/dd/yyy").parse("12/20/2014");

	}
	
	@Test
	public void canDefineValidAdvSchemes() {
		
		// Test input
		
		AdvLocation l1 = new FrontAdvLocation("test");
		AdvLocation l2 = new FrontAdvLocation("test");
		Date ds1 = null, de1 = null, ds2 = null, de2 = null;
		try {
			ds1 = new SimpleDateFormat("MM/dd/yyy").parse("11/05/2014");
			de1 = new SimpleDateFormat("MM/dd/yyy").parse("12/10/2014");
			ds2 = new SimpleDateFormat("MM/dd/yyy").parse("12/15/2014");
			de2 = new SimpleDateFormat("MM/dd/yyy").parse("12/31/2014");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Test schemes
		AdvScheme scheme1 = new AdvScheme(ds1, de1, l1);
		AdvScheme scheme2 = new AdvScheme(ds2, de2, l2);
		
		// Create a new advertisement scheme manager
		AdvSchemeManager asm = new AdvSchemeManager();
		List<AdvScheme> res = asm.getSchemes();
		
		// Add schemes
		asm.defineAdvScheme(scheme1);
		asm.defineAdvScheme(scheme2);
		
		// Assert
		assertEquals(res.size(), 2);
		assertEquals(res.get(0), scheme1);
		assertEquals(res.get(1), scheme2);
		
	}
	
	@Test
	public void cantAddSchemesForAdvLocationsThatAreOccupied() {
		// Test input
				AdvLocation l1 = new FrontAdvLocation("test");
				AdvLocation l2 = new FrontAdvLocation("test");
				Date ds1 = null, de1 = null, ds2 = null, de2 = null, ds3 = null, de3 = null, ds4 = null, de4 = null, de5 = null, ds5 = null;
				try {
					ds1 = new SimpleDateFormat("MM/dd/yyy").parse("11/05/2014");
					de1 = new SimpleDateFormat("MM/dd/yyy").parse("12/10/2014");
					ds2 = new SimpleDateFormat("MM/dd/yyy").parse("10/15/2014");
					de2 = new SimpleDateFormat("MM/dd/yyy").parse("12/31/2014");
					ds3 = new SimpleDateFormat("MM/dd/yyy").parse("10/15/2014");
					de3 = new SimpleDateFormat("MM/dd/yyy").parse("11/06/2014");
					ds4 = new SimpleDateFormat("MM/dd/yyy").parse("12/09/2014");
					de4 = new SimpleDateFormat("MM/dd/yyy").parse("12/15/2014");
					ds5 = new SimpleDateFormat("MM/dd/yyy").parse("05/08/2014");
					de5 = new SimpleDateFormat("MM/dd/yyy").parse("11/06/2014");
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				// Test schemes
				AdvScheme scheme1 = new AdvScheme(ds1, de1, l1);
				AdvScheme scheme2 = new AdvScheme(ds2, de2, l2);
				AdvScheme scheme3 = new AdvScheme(ds3, de3, l2);
				AdvScheme scheme4 = new AdvScheme(ds4, de4, l2);
				AdvScheme scheme5 = new AdvScheme(ds5, de5, l2);
				
				// Create a new advertisement scheme manager
				AdvSchemeManager asm = new AdvSchemeManager();
				
				assertTrue(asm.defineAdvScheme(scheme1));
				assertFalse(asm.defineAdvScheme(scheme2));
				assertFalse(asm.defineAdvScheme(scheme3));
				assertFalse(asm.defineAdvScheme(scheme4)); 
				assertFalse(asm.defineAdvScheme(scheme5)); 
	}
	
	@Test
	public void canCreateNewAdvertisement() {
	
		
		// Create new advertisement object
		//Advertisement advertisement = createAdvertisementTestObject();
		assertEquals(1, 1);
	}
	/*
	private Advertisement createAdvertisementTestObject() {
		// Create adv scheme object
		Date start = new SimpleDateFormat("MM/dd/yyy").parse("12/05/2014");
		Date end   = new SimpleDateFormat("MM/dd/yyy").parse("12/20/2014");
		AdvScheme advScheme = new AdvScheme(start, end);
	}*/
}
