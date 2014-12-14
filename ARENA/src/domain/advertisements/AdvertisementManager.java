package domain.advertisements;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import technical.FileUploader;
import technical.IFileUploader;
import datalayer.DAOFactory;
import datalayer.IAdvertisementDAO;
import domain.users.Advertiser;

public class AdvertisementManager {
	
	private List<Advertisement> advertisements = new ArrayList<>();

	public Iterator<Advertisement> getAdvertisements() {
		return advertisements.iterator();
	}

	public void setAdvertisements(List<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}
	
	public void addAdvertisement(Advertisement advertisement) {
		advertisements.add(advertisement);
	}
	
	public void createAdv(Advertiser owner, AdvLocation advLocation, AdvScheme scheme, File image) {
		Advertisement advertisement = new Advertisement(owner, advLocation, scheme, image);
		
		// upload
		try {
			IFileUploader fileUploader = new FileUploader(null, 3232, image);
			fileUploader.upload();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// save to db
		IAdvertisementDAO advDAO = DAOFactory.getAdvertisementDAO();
		advDAO.addAdvertisement(advertisement);
	}
	
	public void removeAdvertisement(Advertisement adv) {
		advertisements.remove(adv);
		IAdvertisementDAO advDAO = DAOFactory.getAdvertisementDAO();
		advDAO.deleteAdvertisement(adv);
	}
	
	public void loadAds() {
		// load ads from db
	}
	
	public void saveAds() {
		// save to db
	}
}
