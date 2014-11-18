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

	public Database(String driver, String dbName, int port, String userName,
			char[] password) {
		this.driver = driver;
		this.userName = userName;
		this.password = password;
		this.port = port;
		this.dbName = dbName;
	}

	
	protected void connect() {
		try {
			Class.forName(driver);

			setConnection(DriverManager.getConnection(getURL(), userName,
					password.toString()));
			System.out.println("hej2");
		} catch (ClassNotFoundException classEx) {
			classEx.printStackTrace();
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		} finally {
			password = null;

		}
	}

	public void disconnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void executeQuery() {

	}

	public void beginTransaction() {
		try {
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void commit() {
		try {
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void rollback() {
		try {
			connection.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet executeQuery(String sqlCommand, SqlParameter... params)
			throws SQLException {
		PreparedStatement statement = createPreparedStatement(sqlCommand,
				params);
		ResultSet rs = statement.executeQuery();
		return rs;
	}

	public void executeNonQuery(String sqlCommand, SqlParameter... params)
			throws SQLException {
		PreparedStatement statement = createPreparedStatement(sqlCommand,
				params);
		statement.executeUpdate();
	}

	private PreparedStatement createPreparedStatement(String sqlCommand,
			SqlParameter... params) throws SQLException {

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

	private void setConnection(Connection conn) {
		this.connection = conn;
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