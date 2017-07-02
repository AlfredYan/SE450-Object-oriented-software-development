/***
 * In java, method parameters are "call-by-value". The value of the variable is copied into the method parameters.
 * Can not modify the pointer of the object,
 * Can modify the object it's pointing to if it's a reference type.
 * @author KYAN4
 *
 */
public class MethodParameterDemo {
	private MethodParameterDemo(){}
	static public void main(String[] args){
		
		int x = 42;
		int y = 27;
		MethodParameterDemo.swapInt(x, y);
		System.out.println(x); // 42
		System.out.println(y); // 27
		
		String j = "hello";
		String k = "world";
		MethodParameterDemo.swapString(j, k);
		System.out.println(j); // hello
		System.out.println(k); // world
		
		StringObject so1 = new StringObject("hello");
		StringObject so2 = new StringObject("world");
		MethodParameterDemo.swapStringObject(so1, so2);
		System.out.println(so1); // world
		System.out.println(so2); // hello
		
	}
	
	static private void swapInt(int a, int b){
		int t = a;
		a = b;
		b = t;
	}
	
	static private void swapString(String a, String b){
		String t = a;
		a = b;
		b = t;
	}
	
	static private void swapStringObject(StringObject a, StringObject b){
		String t = a.str;
		a.str = b.str;
		b.str = t;
	}
	
}

class StringObject{
	public String str;
	public StringObject(String str){
		this.str = str;
	}
	public String toString(){
		return this.str;
	}
}
