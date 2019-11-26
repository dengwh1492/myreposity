package cn.tedu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.tedu.domain.User;
import cn.tedu.service.UserService;
/*
 * controller类控制程序的中转站
 */
@Controller
public class UserController {
	    @Autowired
		UserService userService;
		
		public void registeUser(User user){
			userService.registUser(user);
		}
		
}
