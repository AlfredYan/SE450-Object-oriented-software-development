/***
 * Overriding instance fields
 * 
 * @author kaichengyan
 *
 */
public class BindingDemo5 {

	public static void main(String[] args) {
		/**
		 * the same reason as hiding
		 */
		(new BindingB5()).m();
	}
}

class BindingA5 {
	final int x = 10;
	void p() {
		System.out.println("BindingA5.p: " + x);
	}
}

class BindingB5 extends BindingA5 {
	final int  x = 20;
	void m() {
		this.p();
		System.out.println("BindingB5.m: " + x);
	}
}
