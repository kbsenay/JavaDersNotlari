package kodlamaioProject;

import java.util.Iterator;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +  " isimli kullan�c� eklendi!");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
			
		}
	}
	
	public void update(User user) {
		System.out.println(user.getId() + "  no.lu kullan�c�n�n bilgisi g�ncellendi!");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " no.lu kullan�c� silindi!");
	}
	
	public void deleteMultiple(User [] users) {
		for (User user : users) {
			delete(user);
			
		}
	}

}
