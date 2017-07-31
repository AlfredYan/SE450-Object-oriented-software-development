/***
 * Method dispatch - Inner class
 * @author kaichengyan
 *
 */
public class BindingDemo4 {

	public static void main(String[] args) {
		BindingA4 a = new BindingB4();
		I i = a.getI();
		i.m();
	}
}

interface I {
	void m();
}

class BindingA4 {
	void p() {
		System.out.println("BindingA4.p");
	}
	
	private void r() {
		System.out.println("BindingA4.r");
	}
	
	I getI() {
		return new I() {

			@Override
			public void m() {
				
				/**
				 * depend on this.p()/this.r() (public, private, static...)
				 */
				BindingA4.this.p();
				BindingA4.this.r();
			}
		};
	}
}

class BindingB4 extends BindingA4 {
	void p() {
		System.out.println("BindingB4.p");
	}
	
	private void r() {
		System.out.println("BindingB4.r");
	}
}
