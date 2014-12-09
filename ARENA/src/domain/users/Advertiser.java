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
	
	
	/**
	   * Returns the total sum of money that advertiser can convert the current number of clicks on his advertisements into. 
	   */ 
	/*
	public double getTotalAdsWorthMoney() {
		return ArenaBankService.calcTotalMoney(advertisements, false);
	}*/
	
	/**
	   * Changes total number of clicks on advertiser's ads and converts into corresponding sum cash
	   */ 
	/*
	public void exchangeClicks() {
		// Feels like a bit poorly chosen method name, but oh well.. ;) 
		double totalConvertableMoney = ArenaBankService.calcTotalMoney(advertisements, true);
		account.deposit(totalConvertableMoney);
	}
	*/

	public void charge(double amount) {
		this.account.withdraw(amount);
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
