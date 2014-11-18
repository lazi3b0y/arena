package technical.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlParameter {
	private final Object value;

	public SqlParameter(Object value) {
		this.value = value;
	}

	public void addToPreparedStatement(PreparedStatement statement, int order)
			throws SQLException {
		statement.setObject(order, getValue());
	}

	public Object getValue() {
		return value;
	}
}
