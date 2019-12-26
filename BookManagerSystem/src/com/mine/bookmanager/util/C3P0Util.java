package com.mine.bookmanager.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/**
 * C3P0工具类
 * @author 曾远洋
 * @time 2019年12月8日下午9:49:11
 * @version V1.0
 */
public class C3P0Util {
	private static DataSource ds = new ComboPooledDataSource();
	
	public static DataSource getDataSource() {
		return ds;
	}
	
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException("服务器连接错误");
		}
	}
	
	public static void close(Connection conn,Statement stmt,ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				stmt = null;
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
}
