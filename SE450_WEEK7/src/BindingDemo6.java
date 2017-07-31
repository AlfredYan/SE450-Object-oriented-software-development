/***
 * Overriding static field
 *  
 * @author kaichengyan
 *
 */
public class BindingDemo6 {

}

class BindingA6 {
	static final int x = 10;
	static void p() {
		System.out.println("BindingA6.p: " + x);
	}
}

class BindingB6 extends BindingA6 {
	static final int x = 20;
	void m() {
		p();
		System.out.println("BindingB6.m: " + x);
	}
}
