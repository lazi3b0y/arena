package domain.advertisements;

import java.util.Random;

public class Advertisement {
	
	private int advID;
	private int ownerID; /* Temp, could be changed to Advertiser object instead if needed.  */
	private AdvLocation advertisementLocation;
	private AdvScheme advertisementScheme;
	
	/* Initial state - advertisements must be approved by an operator before it should be displayed.
	 * 
	 * Note: Use case needs to be changed here to make more sense - so advertisers make applications that get approved rather than - ask for permission - (and then upload).
	 * 
	 *  */
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
}