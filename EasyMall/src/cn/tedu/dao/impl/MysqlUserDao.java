package cn.tedu.dao.impl;

import org.springframework.stereotype.Repository;

import cn.tedu.dao.UserDao;
import cn.tedu.domain.User;
//@Repository
public class MysqlUserDao implements UserDao{
    /**
     * �û��Ƿ����
     */
	public Object FindUserByName(String name) {
		if("cy".equals(name)){
			return new User("����","123","123@qq.com",10);
		}else{
			return null;
		}
	}
/**
 * ����û�
 */
	public void addUser(User user) {
		System.out.println("��Mysql���ݿ�������û��ɹ�"+user);
		
		
	}

}
