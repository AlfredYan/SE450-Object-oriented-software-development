package mockdemo;

public class LoginValidator {
	private IPasswordValidator _passwordValidator;
	
	public LoginValidator(IPasswordValidator passwordValidator){
		_passwordValidator = passwordValidator;
	}
	
	// Makes sure the user's password hash matches
	public void validateLogin(User user, String password) throws Exception{
		boolean passwordIsValid = _passwordValidator.isPasswordValid(user, password);
		if(!passwordIsValid){
			throw new Exception("Password not valid");
		}
	}
}