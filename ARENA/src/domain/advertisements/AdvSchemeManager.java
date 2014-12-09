package domain.advertisements;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* This class handles the responsibility for managing advertisement schemes (defining schemes and making sure they are valid, etc.)

 * */

public class AdvSchemeManager {

	private List<AdvScheme> advSchemes = new ArrayList<>();

	public void addAdvScheme(Date start, Date end, AdvLocation location) {
		AdvScheme advScheme = new AdvScheme(start, end, location);
	}

	public boolean defineAdvScheme(AdvScheme advScheme) {
		if (schemeAvailable(advScheme)) {
			advSchemes.add(advScheme);
			return true;
		}
		return false;
	}

	public boolean defineAdvScheme(Date from, Date to, AdvLocation location) {
		AdvScheme advScheme = new AdvScheme(from, to, location);
		if (schemeAvailable(advScheme)) {
			advSchemes.add(advScheme);
			return true;
		}
		return false;
	}

	private boolean schemeAvailable(AdvScheme scheme) {
		for (AdvScheme _scheme : advSchemes) {
			if (_scheme.compareTo(scheme)) {
				return false;
			}
		}
		return true;
	}

	public List<AdvScheme> getSchemes() {
		return advSchemes;
	}

	/*
	 * Load schemes from database
	 */
	public void loadSchemes() {

	}

}
