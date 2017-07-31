/***
 * Method dispatch - instant method
 * 
 * Static dispatch: The method that will be called is determined at compile time.
 * Dynamic dispatch: The method that will be called is determined at run time.
 * 
 * @author kaichengyan
 *
 */
public class BindingDemo {

	public static void main(String[] args) {
		/**
		 * The actual type is BindingB, so when call m() and call p() in it,
		 * it will find the p() in the object, which is BindingB.
		 */
		(new BindingB()).m();
	}
}

class BindingA {
	void p() {
		System.out.println("BindindA.p");
	}
	
	void m() {
		System.out.println("BindingA.m");
		this.p();
	}
}

class BindingB extends BindingA{
	void p() {
		System.out.println("BindingB.p");
	}
}
