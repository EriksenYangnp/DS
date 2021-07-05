package C5_LinkedList;

public class P135_LinkList {
	private P135_Link first;
	
	public void P135_LinkList() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int id, double dd) {
		P135_Link newLink = new P135_Link(id, dd);
		newLink.next = first;
		first = newLink;
	}
	
	public P135_Link deleteFirst() {
		P135_Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.print("List fist -> last: ");
		P135_Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
}
