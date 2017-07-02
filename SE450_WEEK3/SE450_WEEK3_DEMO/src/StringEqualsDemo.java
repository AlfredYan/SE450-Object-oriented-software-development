public class StringEqualsDemo {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2);// true
		
		System.out.println(str3.equals(str4));// true
		System.out.println(str3 == str4);// false

		System.out.println(new String("Hello").equals(new String("Hello")));// true
		System.out.println(new String("Hello") == new String("Hello"));// false
		
		System.out.println(str1.equals(new String("Hello")));// true
		System.out.println(str1 == new String("Hello"));// false
		
		
		
		Integer num1 = new Integer(1);
		int num2 = 1;
		System.out.println(num1 == num2);// true
		System.out.println(num1.equals(num2));// true
		
		Dog dog1 = new Dog("aa", 1);
		Dog dog2 = new Dog("aa", 1);
		System.out.println(dog1 == dog2);// false
		System.out.println(dog1.equals(dog2));// false
	}
}

class Dog {
	public String name;
	public int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
}