package cn.tedu.dao;
/**
 * 实现Dao层的接口
 */
import cn.tedu.domain.User;

public interface UserDao {
	public Object FindUserByName(String name);
	public void addUser(User user);

}
