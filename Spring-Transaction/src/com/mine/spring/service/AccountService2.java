package com.mine.spring.service;



import com.mine.spring.dao.IAccountDao;
public class AccountService2 implements IAccountService {
	
	private IAccountDao accountDao;
	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	@Override
	public void transfer(String inner, String outer, Integer money) {
		accountDao.in(inner, money);
		int i = 1/0;
		accountDao.out(outer, money);
	}

}
