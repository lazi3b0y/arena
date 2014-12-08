package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import domain.Account;
import domain.advertisements.AdvLocation;
import domain.advertisements.Advertisement;
import domain.advertisements.FrontAdvLocation;
import domain.users.Advertiser;
import domain.users.User;

public class HandlingAccountBalanceTests {

	@Test
	public void clickingOnAdvertisementsGeneratesMoneyToAdvOwnerBalance() {
		// Test user
		Advertiser advertiser = new Advertiser("Test");
		
		// Create some test advertisements
		List<Advertisement> ads = new ArrayList<>();
		AdvLocation loc1 = new FrontAdvLocation(null);
		AdvLocation loc2 = new FrontAdvLocation(null);
		Advertisement adv1 = new Advertisement(loc1, null);
		Advertisement adv2 = new Advertisement(loc2, null);
		ads.add(adv1);
		ads.add(adv2);
		
		// Add some clicks
		adv1.addClick();
		adv1.addClick();
		adv2.addClick();

		advertiser.setAdvertisements(ads);
		
		assertEquals(loc1.getMoneyPerClick() * 3, advertiser.getTotalConvertableMoney(), 1e-15);
	}
	
	@Test
	public void canWithdrawAndDepositFromAdvertisersAccount() {
		// Test user
		Advertiser advertiser = new Advertiser("Test");
		// Test account
		Account account = new Account(5000);
		advertiser.setAccount(account);
		advertiser.getAccount().withdraw(3000);
		assertEquals(2000, advertiser.getAccount().getBalance(), 1e-15);
		advertiser.getAccount().deposit(3000);
		assertEquals(5000, advertiser.getAccount().getBalance(), 1e-15);
	}
	

}
