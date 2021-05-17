package nLayeredETrade.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredETrade.core.abstracts.UserCheckService;


public class UserCheckManager implements UserCheckService{
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	 
	
	
	private String code = "abcde";
	
	

	@Override
	public boolean emailValidate(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,	Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}

	@Override
	public boolean passwordValidate(String password) {
		if(password.length() < 6) {
			System.out.println("Parolanýz en az 6 karakter olmalýdýr!");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean fullNameValidate(String firstName, String lastName) {
		if(firstName.length() < 2 || lastName.length() < 2) {
			System.out.println("Adýnýz ve soyadýnýz en az 2 karakter olmalýdýr!");
			return false;
		} 
		return true;
	}

	@Override
	public void sendVerificationCode(String email) {
		System.out.println("Doðrulama kodu gönderildi : " + email );
		
	}

	@Override
	public boolean mailClicked(String verificationCode) {
		if (code == verificationCode) {
			sendInformation("Hesabýnýz doðrulandý");
			return true;
		}else {
			sendInformation("Hesabýnýz doðrulanamadý");
		}
		return false;
	}

	@Override
	public void sendInformation(String information) {
		System.out.println(information);
		
	}

}
