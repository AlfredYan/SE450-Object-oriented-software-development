/***
 * Method dispatch - static method
 * 
 * @author kaichengyan
 *
 */
public class BindingDemo2 {

	public static void main(String[] args) {
		(new BindingB2()).m();
	}
}

class BindingA2 {
	static void p() {
		System.out.println("BindingA2.p");
	}
	
	void m() {
		System.out.println("BindingA2.m");
		
		/**
		 * If you call a static method, 
		 * it will base on what class you're current in.
		 */
		p();
	}
}

class BindingB2 extends BindingA2 {
	static void p() {
		System.out.println("BindingB2.p");
	}
}
