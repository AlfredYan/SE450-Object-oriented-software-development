/***
 * == compares the value in the stack.
 * The default implementation .equals() in Object is the same as ==.
 * Override .equals() to compare the properties' value of reference types.
 * 
 * Primitive types have to use == to compare.
 * @author Leo
 *
 */
public class ComparisonDemo {
	public static void main(String[] args) {
		
		int a = 4;
		int b = 4;
		boolean comparisonResult = a == b;
		System.out.println(comparisonResult);
		
		StringObjectComparison x = new StringObjectComparison("hello");
		StringObjectComparison y = new StringObjectComparison("hello");
		
		comparisonResult = x == y;
		System.out.println(comparisonResult);
		
		comparisonResult = x.equals(y);
		System.out.println(comparisonResult);
	}
}

class StringObjectComparison{
	public String str;
	public StringObjectComparison(String str){
		this.str = str;
	}
	public String toString(){
		return this.str;
	}
	
	@Override
	public boolean equals(Object o){
		
		if(o.getClass() != getClass())
			return false;
//		if(!(o instanceof StringObjectComparison))
//			return false;
		
		if(o == null)
			return false;
		
		try {
			StringObjectComparison soc = (StringObjectComparison)o;
			return this.str.equals(soc.str);
		} catch (Exception e) {
			return false;
		}
	}
}
