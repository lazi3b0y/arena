package domain;

public class Game {
	private String name, description;
	
	public Game(String name, String description) {
		this.setName(name);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}