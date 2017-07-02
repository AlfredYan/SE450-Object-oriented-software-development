package mockdemo;

public class PasswordValidator implements IPasswordValidator {
	private IPasswordHasher _passwordHasher;
	
	public PasswordValidator(IPasswordHasher passwordHasher){
		_passwordHasher = passwordHasher;
	}
	
	@Override
	public boolean isPasswordValid(User user, String password) {
		String hashedPassword = _passwordHasher.getPasswordHash(password);
		return hashedPassword.equals(user.passwordHash);
	}

}
