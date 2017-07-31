/***
 * Method dispatch - private method
 * @author kaichengyan
 *
 */
public class BIndingDemo3 {

	public static void main(String[] args) {
		(new BindingB3()).m();
	}
}

class BindingA3 {
	private void p() {
		System.out.println("BindingA3.p");
	}
	
	void m() {
		System.out.println("BindingA3.m");
		
		/**
		 * private depends on the type you current in and not the actual type of the object.
		 */
		this.p();
	}
}

class BindingB3 extends BindingA3 {
	private void p() {
		System.out.println("BindingB.p");
	}
}
