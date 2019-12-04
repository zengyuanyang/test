package com.mine.mvc.util;

import java.sql.ResultSet;
/**
 * 接口映射
 * @author 曾远洋
 * @time 2019年12月2日下午4:01:43
 * @version V1.0
 */
public interface IMakeRowToObject {
	public Object rowToObject(ResultSet rs);
}
