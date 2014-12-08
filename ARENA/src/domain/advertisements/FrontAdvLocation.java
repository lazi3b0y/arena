package domain.advertisements;

public class FrontAdvLocation extends AdvLocation {

	public FrontAdvLocation(String description) {
		super(400, 200, 1.0);
	}
	
	@Override
	public String toString() {
		return "Front page";
	}

}
