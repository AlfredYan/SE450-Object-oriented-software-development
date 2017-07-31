/***
 * Hiding
 * 
 * Hiding will not affect behavior of parent class.
 * @author kaichengyan
 *
 */
public class HidingDemo2 {

	public static void main(String[] args) {
		
		/**
		 *  The i in HidngB2 hide the i in HidingA2. When call getI(),
		 *  the getI() in HidingA2 will be called because of no getI() in HidingB2,
		 *  and get the nearest i(smallest scope), so that the i in HidingA2 will be returned.
		 */
			
		HidingA2 a = new HidingB2(100);
		HidingB2 b = new HidingB2(10);
		
		System.out.println(a.getI());
		System.out.println(b.getI());
		
		a.count(15);
		b.count(15);
		
		System.out.println(a.getI());
		System.out.println(b.getI());
	}

}

class HidingA2 {
	int i;
	public HidingA2(int i) {
		this.i = i;
	}
	
	public int count(int limit) {
		for(int it=0; it<limit; it++) {
			i++;
		}
		return i;
	}
	
	public int getI() {
		return i;
	}
}

class HidingB2 extends HidingA2{
	int i; // hiding
	public HidingB2(int i) {
		super(i);
		this.i = i+10;
	}
}