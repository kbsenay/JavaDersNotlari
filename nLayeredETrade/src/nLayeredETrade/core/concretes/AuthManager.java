package nLayeredETrade.core.concretes;

import nLayeredETrade.business.abstracts.UserService;
import nLayeredETrade.core.abstracts.AuthService;
import nLayeredETrade.core.abstracts.UserCheckService;
import nLayeredETrade.entities.concretes.User;

public class AuthManager implements AuthService{
	UserService userService;
	UserCheckService userCheckService;

	public AuthManager(UserService userService, UserCheckService userCheckService) {
		super();
		this.userService = userService;
		this.userCheckService = userCheckService;
	}




	@Override
	public void signIn(User user) {
		if (!access(user)) {
			System.out.println("Eposta ve �ifre girilmeli!");
			return;
		} else {
			System.out.println("Giri� yap�ld� : " + "Ho� Geldiniz " + "Say�n " + user.getFirstName()+ " "+ user.getLastName());
		}
		
	}



	
	private boolean access(User user) {
		if (!user.getEmail().isBlank() && !user.getPassword().isBlank()) {
			return true;
		} else {
			return false;

		}
	}
	
	
	

}
