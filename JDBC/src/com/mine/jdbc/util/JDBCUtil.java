package com.mine.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class JDBCUtil {
	private static String jdbcdriver;
	private static String jdbcurl;
	private static String jdbcuser;
	private static String jdbcpassword;
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	static {
		//获取属性文件的值
		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		jdbcdriver = rb.getString("jdbcdriver");
		jdbcurl = rb.getString("jdbcurl");
		jdbcuser = rb.getString("jdbcuser");
		jdbcpassword = rb.getString("jdbcpassword");
		try {
			//加载驱动
			Class.forName(jdbcdriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//获取连接
	@SuppressWarnings("finally")
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn =  DriverManager.getConnection(jdbcurl, jdbcuser, jdbcpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			return conn;
		}
		
	}
	
	
	//执行增删改操作
	public static int executeUpdate(String sql,Object...params) {
		int num = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			if(params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		return num;
		
	}
	
	
	//查询一个集合
	public static List executeQueryList(String sql,MakeRowToObject mrto,Object...params) {
		List list = new ArrayList();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			if(params != null && params.length > 0) {
				for (int i = 0; i < params.length; i++) {
					pstmt.setObject(i + 1, params[i]);
				}
			}
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Object obj = mrto.rowToObject(rs);
				list.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
			
		}
		return list;
		
	}
	
	
	//查询一行
	public static Object executeQueryObject(String sql,MakeRowToObject mrto,Object...params) {
		List<Object> list = executeQueryList(sql, mrto, params);
		if(list != null && list.size() > 0) {
			return list.get(0);
		}else {
			return null;
		}
		
	}
	
	
	//查询一个值
	public static Object executeQueryValue(String sql , Object... prarms) {
		Object obj  = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			//设置参数
			if(prarms != null && prarms.length > 0) {
				for (int i = 0; i < prarms.length; i++) {
					pstmt.setObject(i+1, prarms[i]);
				}
			}
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				obj = rs.getObject(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll(rs, pstmt, conn);
		}
		return obj;
	}
	
	//释放连接
	public static void closeAll(ResultSet rs,PreparedStatement pstmt,Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
