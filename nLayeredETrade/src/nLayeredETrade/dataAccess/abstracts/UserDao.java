package nLayeredETrade.dataAccess.abstracts;

import java.util.List;

import nLayeredETrade.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
	boolean emailIsExist(String email);

}
