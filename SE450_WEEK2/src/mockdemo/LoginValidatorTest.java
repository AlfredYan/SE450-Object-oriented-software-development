/***
 * use inner class(Lambda expression) to implement the interface which has just a single function
 */
package mockdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginValidatorTest {

	@Test
	public void testValidateLoginDoesntThrowExceptionForValidPassword() {
		// Arrange
		User user = new User();
		user.passwordHash = "testHash";
		//without inner class
//		IPasswordValidator passwordValidator = new TestPasswordValidator();
//		LoginValidator lv = new LoginValidator(passwordValidator);
		//with inner class(Lambda)
		LoginValidator lv = new LoginValidator((User u, String password) -> true);
		
		// Act
		try {
			lv.validateLogin(user, "password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail();
		}
		
		// Assert
		assertTrue(true);
	}
	
	@Test
	public void testValidateLoginThrowsExceptionForInvalidPassword() {
		// Arrange
		User user = new User();
		user.passwordHash = "testHash";
		//with inner class(Lambda)
		LoginValidator lv = new LoginValidator((User u, String password) -> false);
		
		// Act
		try {
			lv.validateLogin(user, "password");
			fail();
		} catch (Exception e) {
		}
		
		// Assert
		assertTrue(true);
	}
	
	//without inner class, we need to create another class to implements interface.
	class TestPasswordValidator implements IPasswordValidator{
		@Override
		public boolean isPasswordValid(User user, String password){
			return true;
		}
	}

}
