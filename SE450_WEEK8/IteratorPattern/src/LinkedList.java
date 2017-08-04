import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class LinkedList implements ICollection{

	public LinkedListNode head;
	
	@Override
	public void add(int i) {
		LinkedListNode oldHead = head;
		head = new LinkedListNode();
		head.payload = i;
		head.next = oldHead;
	}
	
	// Factory method pattern
	@Override
	public IIterator getIterator() {
		return new LinkedListIterator(this);
	}

	// Iterator pattern
	public class LinkedListIterator implements IIterator {

		private LinkedListNode currentNode;
		
		public LinkedListIterator(LinkedList list) {
			currentNode = list.head;
		}
		
		@Override
		public boolean hasNext() {
			return currentNode.next != null;
		}

		@Override
		public int getNext() {
			int currentPayload = currentNode.payload;
			currentNode = currentNode.next;
			return currentPayload;
		}
		
	}
}
