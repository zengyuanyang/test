package com.mine.bookmanager.test;


import org.junit.Test;

import com.mine.bookmanager.util.C3P0Util;

public class SystemTest {

	@Test
	public void connectionTest() {
		System.out.println(C3P0Util.getConnection());
	}

}
