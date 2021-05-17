package nLayeredETrade.core.abstracts;

public interface UserCheckService {
	boolean emailValidate(String email);
	boolean passwordValidate(String password);
	boolean fullNameValidate(String firstName, String lastName );
	
	void sendVerificationCode(String email);
	boolean mailClicked(String verificationCode);
	
	void sendInformation(String information);
}
