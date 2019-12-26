package com.mine.dbutil;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

public class UtilTest {

	@Test
	public void testUpdate() {
		QueryRunner qr = new QueryRunner(DBUtil.getDataSource());
		String sql = "UPDATE user SET userName = 'jeck' WHERE userId = ?";
		try {
			System.out.println(qr.update(sql, 6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
