/***
 * Immutable & mutable classes demo
 * 
 * Immutable class: the object passed into the constructor never change.
 * 1. Make all fields final
 * 2. Ensure that field types are immutable classes or,
 * 	  if mutable classes, make sure you instantiate deep
 * 	  copies in the constructor 
 * 
 * This demo's bug cause by passing a mutable class into an immutable class.
 * It will let the immutable class can be change.
 * @author KYAN4
 *
 */
public class ImmutableMutableDemo {
	public static void main(String[] args) {
		AnotherMutableObject amo = new AnotherMutableObject("Hello");
		MutableObject mo = new MutableObject(amo, 3);
		ImmutableObject io = new ImmutableObject("World", mo);
		
		// "s" can not be changed, because of "final".
//		io.s = "Alfred";
		
		//bug fixed
		System.out.println(io.getAMOS());
		mo.amo.setS("Alfred");
		amo.setS("Frank");
		System.out.println(io.getAMOS());
	}
}

class ImmutableObject {
	private final String s;
	private final MutableObject mo;
	
	public ImmutableObject(String s, MutableObject mo) {
		this.s = s;
		
		//the commented statement is a buy, because the AmotherMutableObject can be changed
//		this.mo = new MutableObject(mo.amo, mo.i);
		
		// deep copy for mutable object
		this.mo = new MutableObject(new AnotherMutableObject(mo.amo.s), mo.i);
	}
	
	public String getAMOS() {
		return mo.amo.s;
	}
}

class MutableObject {
	public int i;
	public AnotherMutableObject amo;
	
	public MutableObject(AnotherMutableObject amo, int i) {
		this.amo = amo;
		this.i = i;
	}
	
	public void setI(int i){
		this.i = i;
	}
}

class AnotherMutableObject {
	public String s;
	
	public AnotherMutableObject(String s) {
		this.s = s;
	}
	
	public void setS(String s){
		this.s = s;
	}
}
