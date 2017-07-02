/***
 * Default Interface Implementation (Java8 new feature)
 * If a class implements multiple interfaces, and multiple have a default implementation for the same method,
 * the implementing class must specify its own implementation.
 * @author KYAN4
 *
 */

/**
 * Uncommenting h in interface I1 or g in interface I2 below causes interface K to fail to compile.
 * Uncommenting the default implementations of g and h in interface K and K can be compiled.
 */

interface I1 { 
	public void f (); 
	default public void g () { System.out.println ("I1.g"); } 
//	public void h (); 
} 
interface I2 { 
	public void f (); 
//	default public void g () { System.out.println ("I2.g"); } 
	default public void h () { System.out.println ("I2.h"); } 
} 
interface K extends I1, I2 {
//	default public void g(){ System.out.println ("k.g"); } 
//	default public void h () { System.out.println ("k.h"); } 
} 
class C implements K{ 
	public void f () { System.out.println ("C.f"); } 
} 
public class DefaultInterfaceImplementation { 
	public static void main (String[] args) { 
		C x = new C (); 
		x.f ();
		x.g (); 
		x.h (); 
	} 
} 


