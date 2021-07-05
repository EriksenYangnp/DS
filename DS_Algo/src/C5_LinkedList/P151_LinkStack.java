package C5_LinkedList;

public class P151_LinkStack {
	private P151_LinkList theList;
	
	public P151_LinkStack() {
		theList = new P151_LinkList();
	}
	public void push(long j) {
		theList.insertFirst(j);
	}
	public long pop() {
		return theList.deleteFirst();
	}
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	public void displayStack() {
		System.out.print("Stack top->bottom");
		theList.displayList();
	}
	
}
