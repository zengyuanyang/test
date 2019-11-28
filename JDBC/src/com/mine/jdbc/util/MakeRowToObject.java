package com.mine.jdbc.util;

import java.sql.ResultSet;

public interface MakeRowToObject {
	public Object rowToObject(ResultSet rs);
}
