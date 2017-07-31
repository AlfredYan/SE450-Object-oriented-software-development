/***
 * Hiding
 * 
 * Hiding occurs when a member in an inner scope uses the same name as a member in an outer scope.
 * @author kaichengyan
 *
 */
public class HidingDemo {

	public static void main(String[] args) {
		HidingA a =new HidingA(45);
		System.out.println(a.getI());
		
		int result = a.count(10);
		System.out.println(result);
		System.out.println(a.getI());
	}
}

class HidingA {
	int i;
	public HidingA(int i) {
		this.i = i;
	}
	
	public int count(int limit) {
		int i = 0; // hiding
		
		for(int it=0; it<limit; it++) {
			i++;
		}
		
		return i;
	}
	
	public int getI() {
		return i;
	}
}
