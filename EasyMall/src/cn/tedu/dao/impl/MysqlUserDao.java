package cn.tedu.dao.impl;

import org.springframework.stereotype.Repository;

import cn.tedu.dao.UserDao;
import cn.tedu.domain.User;
//@Repository
public class MysqlUserDao implements UserDao{
    /**
     * 用户是否存在
     */
	public Object FindUserByName(String name) {
		if("cy".equals(name)){
			return new User("曹阳","123","123@qq.com",10);
		}else{
			return null;
		}
	}
/**
 * 添加用户
 */
	public void addUser(User user) {
		System.out.println("向Mysql数据库中添加用户成功"+user);
		
		
	}

}
