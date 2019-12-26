package com.mine.bookmanager.util;

import java.util.UUID;

/**
 * 获取唯一标识符的工具类
 * @author 曾远洋
 * @time 2019年12月8日下午9:47:06
 * @version V1.0
 */
public class UUIDUtil {
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
}
