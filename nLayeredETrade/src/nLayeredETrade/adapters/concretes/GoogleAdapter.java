package nLayeredETrade.adapters.concretes;

import nLayeredETrade.adapters.abstracts.GoogleService;
import nLayeredETrade.entities.concretes.User;

public class GoogleAdapter implements GoogleService{

	@Override
	public void signInWithGoogle(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() + " Gmail ile giriþ yaptý!");
	}

}
