package domain.advertisements;

import java.util.Random;

public class Advertisement {
	
	private int advID;
	private int ownerID; /* Temp, could be changed to Advertiser object instead if needed.  */
	private AdvLocation advertisementLocation;
	private AdvScheme advertisementScheme;
	private int clicks = 0;
	
	
	private AdvApplicationStatus advStatus = AdvApplicationStatus.PENDING;
	
	public Advertisement(int advID, AdvLocation advLocation, AdvScheme advScheme) {
		this.setAdvID(advID);
		this.setAdvertisementLocation(advLocation);
		this.setAdvertisementScheme(advScheme);
	}
	
	public Advertisement(AdvLocation advLocation, AdvScheme advScheme) {
		this.setAdvertisementLocation(advLocation);
		this.setAdvertisementScheme(advScheme);
		this.advID = new Random().nextInt(999);
	}
	
	public void addClick() {
		this.setClicks(this.getClicks() + 1);
	}
	
	public void resetClicks() {
		this.setClicks(0);
	}

	public AdvLocation getAdvertisementLocation() {
		return advertisementLocation;
	}

	public void setAdvertisementLocation(AdvLocation advertisementLocation) {
		this.advertisementLocation = advertisementLocation;
	}

	public AdvScheme getAdvertisementScheme() {
		return advertisementScheme;
	}

	public void setAdvertisementScheme(AdvScheme advertisementScheme) {
		this.advertisementScheme = advertisementScheme;
	}

	public int getAdvID() {
		return advID;
	}

	public void setAdvID(int advID) {
		this.advID = advID;
	}

	public AdvApplicationStatus getAdvStatus() {
		return advStatus;
	}

	public void setAdvStatus(AdvApplicationStatus advStatus) {
		this.advStatus = advStatus;
	}

	public int getClicks() {
		return clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
}