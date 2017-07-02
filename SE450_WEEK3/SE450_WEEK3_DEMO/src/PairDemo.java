/**
 * pair demo (builder pattern example)
 * use builder pattern to convert the mutable class to the immutable class
 * @author KYAN4
 *
 */
public class PairDemo {
	public static void main(String[] args) {
		PairBuilder pb1 = new PairBuilder();
		pb1.setX("cat");
		pb1.setY("dog");
		Pair p1 = pb1.getNewPair();
		System.out.println("p1: " + p1.toString());
		
		PairBuilder pb2 = new PairBuilder();
		pb2.setX("green");
		pb2.setY("blue");
		pb2.setX("red");
		
		Pair p2 = pb2.getNewPair();
		System.out.println("p2: " + p2.toString());
		
		pb2.setX("yellow");
		Pair p3 = pb2.getNewPair();
		System.out.println("p3: " + p3.toString());
		System.out.println("p2: " + p2.toString());
	}
}

final class Pair {
	private final String x;
	private final String y;
	
	public Pair(String x, String y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "; y = " + y;
	}
}

// builder pattern
final class PairBuilder {
	private String x;
	private String y;
	public PairBuilder() {};
	public void setX(String x) {
		this.x = x;
	}
	public void setY(String y) {
		this.y = y;
	}
	public Pair getNewPair() {
		if(x == null || y == null) {
			throw new NullPointerException();
		}
		return new Pair(x, y);
	}
}
