package C5_LinkedList;

public class P177_LinkList {
	private P147_Link first;
	public P177_LinkList() {
		first = null;
	}
	public P147_Link getFirst() {
		return first;
	}
	public void setFirst(P147_Link f) {
		first = f;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public P177_ListIterator getiterator() {
		return new P177_ListIterator(this);
	}
	public void displayList() {
		System.out.print("List fist -> last: ");
		P147_Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
}
