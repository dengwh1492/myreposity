package cn.tedu.dao.impl;

import org.springframework.stereotype.Repository;

import cn.tedu.dao.UserDao;
import cn.tedu.domain.User;
@Repository
public class OracleUserDao implements UserDao{

	public Object FindUserByName(String name) {
		if("cy".equals(name)){
			return new User("曹阳","123","123@qq.com",10);
		}else{
			return null;
		}
	}

	public void addUser(User user) {
		System.out.println("向Oracle数据库中添加用户成功"+user);
		
		
	}

}
