package cn.tedu.dao;
/**
 * ʵ��Dao��Ľӿ�
 */
import cn.tedu.domain.User;

public interface UserDao {
	public Object FindUserByName(String name);
	public void addUser(User user);

}
