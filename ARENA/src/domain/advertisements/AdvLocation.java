package domain.advertisements;

public class AdvLocation {
	
	public static final int EAST = 0;

	private String description;
	private int maxWidth, maxHeight;
	
	public AdvLocation(String description, int maxWidth, int maxHeight) {
		this.setDescription(description);
		this.setMaxHeight(maxHeight);
		this.setMaxWidth(maxWidth);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
}
