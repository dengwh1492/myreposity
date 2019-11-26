package cn.tedu.service.impl;
/**
 * service�� ����ҵ���߼�
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.dao.UserDao;
import cn.tedu.domain.User;
import cn.tedu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
//MysqlUserDao MysqlUserDao = new MysqlUserDao();
//OracleUserDao oracleUserDao = new OracleUserDao();
	  @Autowired
    private  UserDao userDao;
	public void registUser(User user) {
		if(userDao.FindUserByName(user.getName())==null){
			userDao.addUser(user);
		}else{
			throw new RuntimeException("�û��Ѵ���");
		}
	}

}
