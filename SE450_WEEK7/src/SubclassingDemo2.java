/***
 * Override methods
 * 
 * Override a method by supplying a method of the same name, parameters and return type.
 * @author kaichengyan
 *
 */
public class SubclassingDemo2 {
	public static void main(String[] args) {
		Parent2 a = new Parent2(10);
		System.out.println(a.getI());
		Child2 b = new Child2(20);
		System.out.println(b.getI());
		
		a = b;
		System.out.println(a.getI());
	}
}

class Parent2 {
	int i;
	public Parent2(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
}

class Child2 extends Parent2 {
	public Child2(int i) {
		super(i);
	}
	public int getI() {
		return 789;
	}
}