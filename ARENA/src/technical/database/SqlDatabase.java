package technical.database;

public class SqlDatabase extends Database {

	public SqlDatabase(String dbName, int port, String userName,
			char[] password) {
		super("com.microsoft.sqlserver.jdbc.SQLServerDriver", dbName, port, userName, password);
	}
	
	@Override
	protected void connect() { 
	// Additional logic perhaps in the future
		super.connect();
	}

	@Override
	protected String getURL() {
		return "jdbc:sqlserver://MYPC\\SQLEXPRESS;databaseName=" + getDbName();
	}

}
