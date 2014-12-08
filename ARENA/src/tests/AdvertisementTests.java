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
		asm.addAdvScheme(scheme1);
		asm.addAdvScheme(scheme2);
		
		// Assert
		assertEquals(res.size(), 2);
		assertEquals(res.get(0), scheme1);
		assertEquals(res.get(1), scheme2);
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
