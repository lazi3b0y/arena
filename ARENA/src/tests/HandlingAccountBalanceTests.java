package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import domain.Account;
import domain.advertisements.AdvLocation;
import domain.advertisements.Advertisement;
import domain.advertisements.EmptyBalanceException;
import domain.advertisements.FrontAdvLocation;
import domain.users.Advertiser;
import domain.users.User;

public class HandlingAccountBalanceTests {
	
	@Test(expected = EmptyBalanceException.class)
	public void advertisementThrowsExceptionWhenAdvertiserNoMoney() {
		Advertiser advertiser = new Advertiser("Test");
		advertiser.setAccount(new Account(0));
		
		AdvLocation loc = new FrontAdvLocation(null);
		Advertisement adv = new Advertisement(advertiser, loc, null, null);
		adv.addClick();
	}

	@Test
	public void clickingOnAdvertisementsRemovesMoneyFromOwnersAccountBalance() {
		// Test user
		Advertiser advertiser = new Advertiser("Test");
		double testBalance = 100;
		
		Account account = new Account(testBalance);
		advertiser.setAccount(account);
		
		// Create some test advertisements
		List<Advertisement> ads = new ArrayList<>();
		AdvLocation loc1 = new FrontAdvLocation(null);
		AdvLocation loc2 = new FrontAdvLocation(null);
		Advertisement adv1 = new Advertisement(advertiser, loc1, null, null);
		Advertisement adv2 = new Advertisement(advertiser, loc2, null, null);
		ads.add(adv1);
		ads.add(adv2);
		
		// Add some clicks
		try {
		adv1.addClick();
		adv1.addClick();
		adv2.addClick();
		} catch (EmptyBalanceException emptyBalanceEx) { }

		advertiser.setAdvertisements(ads);
		double totalCharge = loc1.getMoneyPerClick() * 3;
		assertEquals(testBalance - totalCharge, advertiser.getAccount().getBalance(), 1e-15);
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
