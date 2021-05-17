package nLayeredETrade.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nLayeredETrade.dataAccess.abstracts.UserDao;
import nLayeredETrade.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	private List<User> users;

	public HibernateUserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Kullanýcý eklendi : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý bilgisi güncellendi!");

	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý silindi!");

	}

	@Override
	public User get(int id) {
		if (!users.isEmpty()) {
			for (User user : users) {
				if (user.getId() == id) {
					System.out.println("Seçilen kullanýcýnýn epostasý : " + user.getEmail());
				} 
			}
		} else {
			System.out.println("Kullanýcýlar bulunamadý!");
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean emailIsExist(String email) {
		for (User user : users) {
			if (user.getEmail() == email) {
				System.out.println("Eposta zaten kullanýmda!");
				return true;
			}
		}
		return false;
		
		
	}

}
