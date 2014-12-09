package domain;

import java.util.List;

import domain.advertisements.AdvLocation;
import domain.advertisements.Advertisement;

public final class ArenaBankService {

	public static double calcTotalMoney(List<Advertisement> advertisements, boolean reset) {
		double money = 0.0;
		
		for (Advertisement adv : advertisements) {
			AdvLocation loc = adv.getAdvertisementLocation();
			money += adv.getClicks() * loc.getMoneyPerClick();
			
			if (reset) adv.resetClicks();
		}
		return money;
	}
}
