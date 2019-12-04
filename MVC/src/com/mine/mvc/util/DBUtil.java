package com.mine.mvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;



/**
 * JDBC工具包
 * @author 曾远洋
 * @time 2019年12月2日下午4:00:35
 * @version V1.0
 */
public class DBUtil {
	private static String dirverClass;
	private static String url;
	private static String user;
	private static String password;
	private static Connection conn = null ; 
	private static PreparedStatement pstm = null;
	private static ResultSet rs = null;
	
	static {
		//加载属性文件
		ResourceBundle rb = ResourceBundle.getBundle("jdbc");
		//给上面的4个变量进行赋值
		dirverClass = rb.getString("dirverClass");
		url = rb.getString("url");
		user = rb.getString("user");
		password = rb.getString("password");
		//加载驱动
		try {
			Class.forName(dirverClass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//获取连接
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	/**
	 * 执行增删改
	 * @param sql 
	 * @param objs 可变参数
	 * @return 受影响行数
	 */
	public static int executeUpdate(String sql, Object... prarms) {
		int num = 0;
		try {
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			//打印SQL语句
			printSQL(sql, prarms);
			//设置参数
			if(prarms != null && prarms.length > 0) {
				for (int i = 0; i < prarms.length; i++) {
					pstm.setObject(i+1, prarms[i]);
				}
				
			}
			  num = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(rs, pstm, conn);
		}
		return num;
	}
	//查询 查询单个值  查询一个集合  查询单个对象
	/**
	 * 查询返回一个集合
	 * @param sql
	 * @param mkeRowToObject 映射对象
	 * @param prarms 可变参数
	 * @return  集合对象
	 */
	public static List executeQueryList(String sql ,IMakeRowToObject mkeRowToObject, Object... prarms) {
		List list = new ArrayList();
		try {
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			//打印SQL语句
			printSQL(sql, prarms);
			//设置参数
			if(prarms != null && prarms.length > 0) {
				for (int i = 0; i < prarms.length; i++) {
					pstm.setObject(i+1, prarms[i]);
				}
			}
			rs = pstm.executeQuery();
			while(rs.next()) {
				//把rs的一条记录封装称为一个对象
				Object obj = mkeRowToObject.rowToObject(rs);
				list.add(obj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(rs, pstm, conn);
		}
		return list;
	} 
	/**
	 * 查询返回一个对象
	 * @param sql 
	 * @param mkeRowToObject 映射
	 * @param prarms 可变参数
	 * @return 对象
	 */
	
	public static Object executeQueryObject(String sql ,IMakeRowToObject mkeRowToObject, Object... prarms) {
		List<Object> list = executeQueryList(sql, mkeRowToObject, prarms);
		if(list != null && list.size() > 0) {
			return list.get(0);
		}else {
			return null;
		}
		
	}
	/**
	 * 查询返回一个值
	 * @param sql
	 * @param prarms
	 * @return 一个值对象
	 */
	public static Object executeQueryValue(String sql , Object... prarms) {
		Object obj  = null;
		try {
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			//打印SQL语句
			printSQL(sql, prarms);
			//设置参数
			if(prarms != null && prarms.length > 0) {
				for (int i = 0; i < prarms.length; i++) {
					pstm.setObject(i+1, prarms[i]);
				}
			}
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				obj = rs.getObject(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(rs, pstm, conn);
		}
		return obj;
	}
	/**
	 * 打印SQL语句
	 * @param sql
	 * @param prarms
	 * @return
	 */
	public static void printSQL(String sql ,Object... prarms) {
		
		StringBuffer returnSQL = new StringBuffer();
		String[] subSQL = sql.split("\\?");
		//有参数证明是动态SQL
		if(prarms != null && prarms.length > 0) {
			for(int i = 0 ; i < prarms.length; i++) {
				returnSQL.append(subSQL[i]).append("'").append(prarms[i]).append("'");
			}
			if(subSQL.length > prarms.length) {
				returnSQL.append(subSQL[subSQL.length - 1]);
			}
			System.out.println(returnSQL.toString());
			return;
		}else {
			System.out.println(sql); 
		}
		
	
	}
	//关闭资源
	public static void closeAll(ResultSet rs , PreparedStatement pstm , Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstm != null) {
			try {
				pstm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
