package domain.advertisements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import domain.users.Advertiser;

public class Advertisement {
	
	private int advID;
	private Advertiser owner;
	private AdvLocation advertisementLocation;
	private AdvScheme advertisementScheme;
	private Image image;
	private int clicks = 0;
	
	
	private AdvApplicationStatus advStatus = AdvApplicationStatus.PENDING;
	
	public Advertisement(int advID, Advertiser owner, AdvLocation advLocation, AdvScheme advScheme, File img) {
		this.setAdvID(advID);
		this.setAdvertisementLocation(advLocation);
		this.setAdvertisementScheme(advScheme);
		this.setOwner(owner); 
		setImage(getImage(img));
	}
	
	public Advertisement(Advertiser owner, AdvLocation advLocation, AdvScheme advScheme, File img) {
		this.setAdvertisementLocation(advLocation);
		this.setAdvertisementScheme(advScheme);
		this.setOwner(owner);
		this.advID = new Random().nextInt(999);
		setImage(getImage(img));
	}
	
	public void addClick() throws EmptyBalanceException {
		chargeAdvertiser();
		this.clicks++;;
	}
	
	public void chargeAdvertiser() throws EmptyBalanceException {
		double amount = advertisementLocation.getMoneyPerClick();
		double delta = owner.getAccount().getBalance() - amount;
		if (delta <= 0.0)
			throw new EmptyBalanceException("Advertiser out of money");
		owner.charge(amount);
	}
	
	
	public void resetClicks() {
		this.setClicks(0);
	}

	private BufferedImage getImage(File imgFile) {
		if (imgFile == null) return null;
		BufferedImage img = null;
		/* Kind of violates SRP, better to move this responsibility to a utility class or something like that */ 
		try {
			img = ImageIO.read(imgFile);
		} catch (IOException ex) {
			System.out.println("Could not load advertisement image. " + ex.getMessage());
		}
		return img;
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

	public Advertiser getOwner() {
		return owner;
	}

	public void setOwner(Advertiser owner) {
		this.owner = owner;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
}