package nLayeredETrade;

import nLayeredETrade.adapters.abstracts.GoogleService;
import nLayeredETrade.adapters.concretes.GoogleAdapter;
import nLayeredETrade.business.abstracts.UserService;
import nLayeredETrade.business.concretes.UserManager;
import nLayeredETrade.core.abstracts.AuthService;
import nLayeredETrade.core.abstracts.UserCheckService;
import nLayeredETrade.core.concretes.AuthManager;
import nLayeredETrade.core.concretes.UserCheckManager;
import nLayeredETrade.dataAccess.abstracts.UserDao;
import nLayeredETrade.dataAccess.concretes.HibernateUserDao;
import nLayeredETrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Kadir Burçin", "Þenay", "kbsenay@gmail.com", "123456");
		User user2 = new User (2, "Engin", "Demiroð", "engindemirog@gmail.com", "9876540");
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager());
		AuthService authService = new AuthManager(userService, null);
		GoogleService googleService =  new GoogleAdapter();
		
		userService.add(user1);
		
		System.out.println("-----------------------------------------------------------------");
		
		userService.add(user2);
		
		System.out.println("-----------------------------------------------------------------");
		
		userService.get(2);
		
		System.out.println("-----------------------------------------------------------------");
		
		authService.signIn(user1);
		
		System.out.println("-----------------------------------------------------------------");
		
		googleService.signInWithGoogle(user2);
		
	}

}
