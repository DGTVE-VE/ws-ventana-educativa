package com.appspot.wsventanaeducativa.dao.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PreparedStatementSetter {
	void prepare(PreparedStatement ps) throws SQLException;
}
