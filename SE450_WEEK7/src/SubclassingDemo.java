/***
 * Object Initialization
 * 
 * Different types have different values when they're not initialized.
 * Reference type: null, Boolean: false, char: null terminator(/u0000)
 * byte, short, int, etc.: 0
 * 
 * When Java objects are initialized, the Constructor is called.
 * The subclass can call the constructor of parent using super().
 * @author kaichengyan
 *
 */
public class SubclassingDemo {

	public static void main(String[] args) {
		Parent a = new Parent();
		a = new Child();
	}
}

class Parent {
	int i;
	public Parent() {
		System.out.println(i);
		System.out.println("Parent");
		i = 10;
		System.out.println(i);
	}
	
	public Parent(int i) {
		this.i = i;
		System.out.println(this.i);
	}
}

class Child extends Parent{
	public Child() {
		super(3);
		System.out.println("Child");
	}
}