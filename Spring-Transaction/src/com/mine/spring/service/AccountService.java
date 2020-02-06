package com.mine.spring.service;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.mine.spring.dao.IAccountDao;
public class AccountService implements IAccountService {
	
	private IAccountDao accountDao;
	private TransactionTemplate transactionTemplate;
	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}


	@Override
	public void transfer(String inner, String outer, Integer money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.in(inner, money);
				int i = 1/0;
				accountDao.out(outer, money);
			}
		});
	}

}
