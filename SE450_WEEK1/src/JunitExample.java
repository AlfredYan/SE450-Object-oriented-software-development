/***
 * An example for JUnit in JunitExampleTest.java
 * @author Leo
 *
 */
public class JunitExample {
	public static void main(String[] args){ 
		StringObjectJunit x = new StringObjectJunit("hello"); 
		StringObjectJunit y = new StringObjectJunit("world"); 
		x.swap(y); 
		System.out.println(x); 
		System.out.println(y); 
	} 
}

class StringObjectJunit{ 
	public String str; 
	public StringObjectJunit(String str){ this.str = str; } 
	public String toString(){ return str; } 
	
	public void swap(StringObjectJunit a){ 
		if(a == null)
			throw new NullPointerException("Parameters can't be null");
		
		String t = a.str; 
		a.str = this.str; 
		this.str = t; 
	} 
}
