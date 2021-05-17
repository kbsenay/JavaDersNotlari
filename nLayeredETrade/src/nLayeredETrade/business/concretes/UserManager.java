package nLayeredETrade.business.concretes;

import java.util.Iterator;
import java.util.regex.Pattern;

import nLayeredETrade.business.abstracts.UserService;
import nLayeredETrade.core.abstracts.UserCheckService;
import nLayeredETrade.dataAccess.abstracts.UserDao;
import nLayeredETrade.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserCheckService userCheckService;

	public UserManager(UserDao userDao, UserCheckService userCheckService) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
	}
	
	public UserManager() {
		
	}

	@Override
	public void add(User user) {
		if (!userDao.emailIsExist(user.getEmail())) {
			
			  if (userCheckService.fullNameValidate(user.getFirstName(),user.getLastName()) 
					  && userCheckService.emailValidate(user.getEmail()) 
					  && userCheckService.passwordValidate(user.getPassword())) {
				  userCheckService.sendVerificationCode(user.getEmail());
			}
			  if (userCheckService.mailClicked("abcde")) {
				  userDao.add(user);
				
			} else {
				System.out.println("Kullanýcý eklenemedi.");

			}
			  
		}
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public User get(int id) {
		return this.userDao.get(id);
	}

	


}
