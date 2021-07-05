package C5_LinkedList;

public class P155_LinkQueue {
	private P155_FirstLastList theList;
	public P155_LinkQueue() {
		theList = new P155_FirstLastList();
	}
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	public void insert(long j) {
		theList.insertLast(j);
	}
	public long remove() {
		return theList.deleteFirst();
	}
	public void displyQueue() {
		System.out.print(" Queer front -> rear ");
		theList.displayList();
	}
}
