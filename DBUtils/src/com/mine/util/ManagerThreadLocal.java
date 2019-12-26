package com.mine.util;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 利用ThreadLocal创建连接和事务操作
 * @author 曾远洋
 * @time 2019年12月5日下午7:02:58
 * @version V1.0
 */
public class ManagerThreadLocal {
	private static ThreadLocal<Connection> tconn = new ThreadLocal<Connection>();
	
	//获取连接
	public static Connection getConnection() {
		Connection conn = tconn.get();
		if(conn == null) {
			conn = C3P0Util.getConnection();
			tconn.set(conn);
		}
		return conn;
	}
	
	//开启事务
	public static void startTransaction() {
		try {
			getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//提交事务
	public static void commit() {
		try {
			getConnection().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//设置回滚点
	public static void setPoint(String savePointName) {
		try {
			getConnection().setSavepoint(savePointName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//回滚事务
	public static void rollBack() {
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//关闭流
	public static void close() {
		try {
			getConnection().close();
			tconn.remove();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
