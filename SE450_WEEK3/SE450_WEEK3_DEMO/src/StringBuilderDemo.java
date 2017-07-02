/***
 * StringBuilder demo
 * string is immutable, and StringBuilder is mutable.
 * @author KYAN4
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("World");
		String s = sb.toString();
		System.out.println(s);
		sb.append("!");
		System.out.print("String after sb.append(!): ");
		System.out.println(s);
		System.out.print("StringBulider after sb.append(!): ");
		System.out.println(sb.toString());
	}
}
