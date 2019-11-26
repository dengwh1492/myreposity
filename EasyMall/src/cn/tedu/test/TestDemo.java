package cn.tedu.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.domain.User;
import cn.tedu.web.UserController;

public class TestDemo {
	@Test
	public void test01(){
		ClassPathXmlApplicationContext context 
		=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserController c = (UserController)context.getBean("userController");
	    c.registeUser(new User("de","123","123@",15));
	}

}
