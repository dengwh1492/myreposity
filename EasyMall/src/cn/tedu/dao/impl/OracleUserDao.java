package cn.tedu.dao.impl;

import org.springframework.stereotype.Repository;

import cn.tedu.dao.UserDao;
import cn.tedu.domain.User;
@Repository
public class OracleUserDao implements UserDao{

	public Object FindUserByName(String name) {
		if("cy".equals(name)){
			return new User("����","123","123@qq.com",10);
		}else{
			return null;
		}
	}

	public void addUser(User user) {
		System.out.println("��Oracle���ݿ�������û��ɹ�"+user);
		
		
	}

}
