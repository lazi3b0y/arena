package domain.advertisements;

public abstract class AdvLocation {
	
	private int maxWidth, maxHeight;
	private double moneyPerClick;
	
	public AdvLocation(int maxWidth, int maxHeight, double moneyPerClick) {
		this.setMaxHeight(maxHeight);
		this.setMaxWidth(maxWidth);
		this.setMoneyPerClick(moneyPerClick);
	}


	public int getMaxWidth() {
		return maxWidth;
	}

	public void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}


	public double getMoneyPerClick() {
		return moneyPerClick;
	}


	public void setMoneyPerClick(double moneyPerClick) {
		this.moneyPerClick = moneyPerClick;
	}
}
