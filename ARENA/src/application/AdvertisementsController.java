package application;

import domain.advertisements.AdvSchemeManager;
/* 
 * Controller that handles each use case associated with Advertisements and responds to system events. 
 * It can be viewed as a facade into the domain layer, which allows to easily adapt to any possible 
 * requirement change (such as calls to remote services, etc.). 
 * 
 * */
public class AdvertisementsController {
	
	private final AdvSchemeManager asm = new AdvSchemeManager();

	public void addScheme( ) {
		
	}
}
