package technical.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Database {
	private Connection connection;
	private final String driver, userName, dbName;
	private final int port;
	// For security purposes
	private char[] password;

	public Database(String driver, String dbName, int port, String userName, char[] password) {
		this.driver   = driver;
		this.userName = userName;
		this.password = password;
		this.port 	  = port;
		this.dbName	  = dbName;
	}

	
	/**
	   * Connect to the database. Every sub class must explicitly call this method.
	   */ 
	
	protected void connect() {
		try {
			// In order for the driver to be loaded at runtime, add the appropriate driver paths in the class path using either the IDE or command prompt.
			Class.forName(driver);

			this.connection = DriverManager.getConnection(getURL(), userName, password.toString());
			
		} catch (ClassNotFoundException classEx) {
			classEx.printStackTrace();
			
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
			
		} finally {
			password = null;

		}
	}

	/**
	   * Disconnect 
	   */ 
	public void disconnect() throws SQLException {
		connection.close();
	}

	public void beginTransaction() throws SQLException {
		connection.setAutoCommit(false);
	}

	public void commit() throws SQLException {
		connection.commit();
	}

	public void rollback() throws SQLException {
		connection.rollback();
	}

	/**
	   * Executes a query that expects a result set (such as SELECT, etc). It will automatically prepare statements, so SQL commands need to be adapted to this.
	   * For instance, the value in the WHERE clause in SELECT query should be replaced with ?, and the value(s) should be passed as SqlParameter objects to this method. 
	   * @param sqlCommand 
	   * @param SqlParameter An array of SqlParameter objects
	   * @exception throws SQLException
	   * @return A SQL result set
	   */ 
	public ResultSet executeQuery(String sqlCommand, SqlParameter... params) throws SQLException {
		PreparedStatement statement = createPreparedStatement(sqlCommand, params);
		ResultSet rs = statement.executeQuery();
		
		return rs;
	}
	
	/**
	   * Executes a SQL query such as UPDATE or INSERT, etc.
	   * @param sqlCommand 
	   * @param SqlParameter An array of SqlParameter objects
	   * @exception throws SQLException
	   * @return void
	   */ 

	public void executeNonQuery(String sqlCommand, SqlParameter... params) throws SQLException {
		PreparedStatement statement = createPreparedStatement(sqlCommand, params);
		statement.executeUpdate();
	}

	/**
	   * Prepares a SQL statement
	   * @param sqlCommand 
	   * @param SqlParameter An array of SqlParameter objects
	   * @exception throws SQLException
	   * @exception throws SQLException
	   * @return Prepared statement
	   */ 
	private PreparedStatement createPreparedStatement(String sqlCommand, SqlParameter... params) throws SQLException {

		PreparedStatement statement = connection.prepareStatement(sqlCommand);

		for (int i = 0; i < params.length; i++) {
			try {
				params[i].addToPreparedStatement(statement, i);
			} catch (SQLException sqlEx) {
				sqlEx.printStackTrace();
			}
		}
		return statement;
	}

	protected abstract String getURL();

	public String getDriver() {
		return driver;
	}

	public Connection getConnection() {
		return connection;
	}

	public String getUserName() {
		return userName;
	}

	public int getPort() {
		return port;
	}

	public String getDbName() {
		return dbName;
	}
}