package com.kgc.dao.impl;

import java.util.*;

import com.kgc.dao.IUserDao;
import com.kgc.pojo.User;
//��������������һ��UserDaoImpl
//���Ľ�����UserDaoImpl
public class UserDaoImpl implements IUserDao {
	//Ϊ���ø��෽���ܹ�ʹ��һ�����ϣ��ͰѼ��϶����ڳ�Ա����λ�á�
	//Ϊ�˲���������ȥ���ʣ���������Ҫ˽�С�
	//Ϊ���ø��������һ����Ա����,��static
	private static List<User> list  = new ArrayList<User>();
	
	@Override
	public boolean isLogin(String userName, String userPwd) {
		//�����ݿ��л�ȡ��Ϣ-----����
		boolean flag = false;
		for (User user : list) {
			if(userName.equals(user.getUserName()) && userPwd.equals(user.getUserPwd())) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		//���浽���ݿ� ------ ���� 
		list.add(user);
	}

}
