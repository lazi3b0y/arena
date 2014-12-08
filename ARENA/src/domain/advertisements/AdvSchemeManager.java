package domain.advertisements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* This class handles the responsibility for managing advertisement schemes (business rules and so on) */

public class AdvSchemeManager {
	
	private List<AdvScheme> advSchemes = new ArrayList<>();
	
	public void addAdvScheme(Date start, Date end, AdvLocation location) {
		AdvScheme advScheme = new AdvScheme(start, end, location);	
	}
	
	public void addAdvScheme(AdvScheme advScheme) {
		advSchemes.add(advScheme);
	}
	
	public List<AdvScheme> getSchemes() {
		return advSchemes;
	}

}
