package domain.users;

public class User {
	
	private String username;
	
	public User(String username) {
		setUsername(username);
	}

	protected void load() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
