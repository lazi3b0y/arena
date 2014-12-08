package domain.users;

import java.util.ArrayList;
import java.util.List;

import domain.Account;
import domain.ArenaBankService;
import domain.advertisements.Advertisement;

public class Advertiser extends User {
	
	private List<Advertisement> advertisements = new ArrayList<>();
	private Account account;

	public Advertiser(String username) {
		super(username);
		
		load();
		
	}
	/* 
	 * Load advertisements, etc. for this specific user
	 */
	
	@Override
	protected void load() {
		// load regular user data
		super.load();
		
		// load ads
	}
	
	public double getTotalConvertableMoney() {
		return ArenaBankService.getTotalConvertableMoney(advertisements, false);
	}
	
	/**
	   * Changes total number of clicks on advertiser's ads and converts into corresponding sum cash
	   */ 
	
	public void exchangeClicks() {
		// Feels like a bit poorly chosen method name, but oh well.. ;) 
		double totalConvertableMoney = ArenaBankService.getTotalConvertableMoney(advertisements, true);
		account.deposit(totalConvertableMoney);
	}


	public List<Advertisement> getAdvertisements() {
		return advertisements;
	}


	public void setAdvertisements(List<Advertisement> advertisements) {
		this.advertisements = advertisements;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
