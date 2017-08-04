
public class ArrayList implements ICollection {

	int[] arr = new int[5];
	int lastIndex = 0;
	
	@Override
	public void add(int i) {
		if(lastIndex >= arr.length) {
			growArray();
		}
		arr[lastIndex++] = i;
	}

	private void growArray() {
		int[] tempArray = new int[lastIndex * 2];
		System.arraycopy(arr, 0, tempArray, 0, arr.length);
		arr = tempArray;
	}
	
	public int get(int index) {
		if(index > lastIndex)
			return 0;
		return arr[index];
	}
	
	// Factory method pattern
	@Override
	public IIterator getIterator() {
		return new ArrayListIterator(this);
	}
	
	// Iterator pattern
	public class ArrayListIterator implements IIterator {
		int currentIndex = 0;
		ArrayList arrayList;
		
		public ArrayListIterator(ArrayList arrayList) {
			this.arrayList = arrayList;
		}
		
		@Override
		public boolean hasNext() {
			return currentIndex + 1 < arrayList.lastIndex;
		}

		@Override
		public int getNext() {
			int payload = arrayList.get(currentIndex);
			currentIndex++;
			return payload;
		}
		
	}

}
