package com.mine.test;


import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.mine.c3p0.C3P0Util;
import com.mine.dbcp.DBCPUtil;

class PoolTest {

	@Test
	void test() {
//		Connection conn = DBCPUtil.getConnection();
//		System.out.println(conn);
		Connection conn2 = C3P0Util.getConnection();
		System.out.println(conn2);
	}

}
