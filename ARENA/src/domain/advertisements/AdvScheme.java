package domain.advertisements;

import java.util.Date;

public class AdvScheme {
	private Date start, end;
	private AdvLocation advLocation;

	public AdvScheme(Date start, Date end, AdvLocation advLocation) {
		this.setStart(start);
		this.setEnd(end);

	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public AdvLocation getAdvLocation() {
		return advLocation;
	}

	public void setAdvLocation(AdvLocation advLocation) {
		this.advLocation = advLocation;
	}

	public boolean compareTo(AdvScheme schemeToCompare) {
		if (this.getStart().after(schemeToCompare.getStart())
				&& this.getStart().before(schemeToCompare.getEnd()))
			return true;
		if (this.getEnd().after(schemeToCompare.getStart())
				&& this.getEnd().before(schemeToCompare.getEnd()))
			return true;

		return false;
	}

}