/***
 * Method dispatch - super overridden
 * 
 * @author kaichengyan
 *
 */
public class BindingDemo7 {

	public static void main(String[] args) {
		(new BindingC7()).m();
	}
}

class BindingA7 {
	void p() {
		System.out.println("BindingA7.p");
	}
}

class BindingB7 extends BindingA7 {
	void p() {
		System.out.println("BindingB7.p");
	}
	
	void m() {
		System.out.println("BindingB7.m");
		this.p();
		
		/**
		 * The super relies on the type of the method you current in and not the actual type.
		 */
		super.p();
	}
}

class BindingC7 extends BindingB7{
	void p() {
		System.out.println("BindingC7.p");
	}
}
