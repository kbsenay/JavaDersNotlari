package nLayeredETrade.business.abstracts;

import nLayeredETrade.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);

}
