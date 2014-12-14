package datalayer;

import java.util.Iterator;
import java.util.List;

import domain.Game;
import domain.advertisements.Advertisement;

public class AdvertisementDAO implements IAdvertisementDAO {

	@Override
	public void addAdvertisement(Advertisement game) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<Advertisement> getAdvertisements() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Game getAdvertisement(Advertisement adv) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteAdvertisement(Advertisement game) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void updateAdvertisement(int advID, Advertisement newAdvertisement) {
		throw new UnsupportedOperationException();
	}
}
