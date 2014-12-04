package domain.advertisements;

import java.util.Date;

public class AdvSchemeManager {
	
	public void createAdvScheme(Date start, Date end, AdvLocation location) {
		AdvScheme advScheme = new AdvScheme(start, end, location);
		
	}

}
