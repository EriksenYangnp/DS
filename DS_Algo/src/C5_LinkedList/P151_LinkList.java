package C5_LinkedList;

public class P151_LinkList {
	private P147_Link first;
	
	public P151_LinkList() {
		first = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	public void insertFirst(long dd) {
		P147_Link newLink = new P147_Link(dd);
		newLink.next = first;
		first = newLink;
	}
	public long deleteFirst() {
		P147_Link temp = first;
		first = first.next;
		return temp.dData;
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
