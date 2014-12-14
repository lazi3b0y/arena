package datalayer;

import java.util.Iterator;

import domain.Game;
import domain.advertisements.Advertisement;

public interface IAdvertisementDAO {

	Iterator<Advertisement> getAdvertisements();

	void addAdvertisement(Advertisement adv);

	void updateAdvertisement(int advID, Advertisement newAdvertisement);

	void deleteAdvertisement(Advertisement adv);

	Game getAdvertisement(Advertisement adv);

}
