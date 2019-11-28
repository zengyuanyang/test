package com.mine.jdbc.util;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class UtilTest {

	@Test
	public void test() throws SQLException {
		System.out.println(JDBCUtil.getConnection());
	}

}
