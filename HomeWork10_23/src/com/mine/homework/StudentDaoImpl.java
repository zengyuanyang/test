package com.mine.homework;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public void add() {
		System.out.println("增加数据");
	}

	@Override
	public void delete() {
		System.out.println("删除数据");
	}

	@Override
	public void updata() {
		System.out.println("修改数据");
	}

	@Override
	public void find() {
		System.out.println("查询数据");
	}
	
}
