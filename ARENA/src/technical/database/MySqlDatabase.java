package technical.database;

public class MySqlDatabase extends Database {

	public MySqlDatabase(String dbName, int port, String userName, char[] password)
	{
		super("com.mysql.jdbc.Driver", dbName, port, userName, password);
		this.connect();
		System.out.println("hej");
	}

	@Override
	protected void connect() { 
		// Perhaps additional logic in the future
		super.connect();
	}
	
	protected String getURL() {
		return "jdbc:mysql://localhost:" + getPort() + "/" + getDbName();
	}
}
