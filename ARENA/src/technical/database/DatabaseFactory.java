package technical.database;

public class DatabaseFactory {

	public static final int MYSQL = 1;
    public static final int MSSQL = 2;
	
	public static Database getDatabase(int type) {
		switch (type) {
		case MYSQL:
			return new MySqlDatabase("testdb", 3306, "root", "password".toCharArray());
		case MSSQL:
			return new SqlDatabase("testdb", 3306, "root", "password".toCharArray());
			default: return null;
		}
	}
}
