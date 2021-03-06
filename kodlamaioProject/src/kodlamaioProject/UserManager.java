package kodlamaioProject;

import java.util.Iterator;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +  " isimli kullanıcı eklendi!");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
			
		}
	}
	
	public void update(User user) {
		System.out.println(user.getId() + "  no.lu kullanıcının bilgisi güncellendi!");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " no.lu kullanıcı silindi!");
	}
	
	public void deleteMultiple(User [] users) {
		for (User user : users) {
			delete(user);
			
		}
	}

}
