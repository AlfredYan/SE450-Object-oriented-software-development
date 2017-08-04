/***
 * Iterator Pattern
 * 1.Create an interface. The common methods are hasNext() and getNext().
 * 2.For each type of collection you have, create a concrete iterator implementation for that collection.
 * 
 * Iterator pattern abstracts for iterating through a collection into a separate object.
 * Each new Collection should be responsible for creating a new Iterator object to iterate over itself.
 * 
 * We can use an interface(IIteratorFactory in this demo) to force new Collections to 
 * implement a getInterface method.(Factory Method Pattern)
 * 
 * @author kaichengyan
 *
 */

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		for(int i=1; i<=10; i++) {
			linkedList.add(i);
		}
		
		ArrayList arrayList = new ArrayList();
		for(int i=1; i<=10; i++) {
			arrayList.add(i);
		}
		
		IIterator linkedListIterator = linkedList.getIterator();
		contains(linkedListIterator, 5);
		
		IIterator arrayListIterator = arrayList.getIterator();
		contains(arrayListIterator, 6);
		
	}
	
	public static void contains(IIterator iterator, int number) {
		while(iterator.hasNext()) {
			if(iterator.getNext() == number) {
				System.out.println("Found " + number + "!");
				break;
			}
			
		}
	}
}
