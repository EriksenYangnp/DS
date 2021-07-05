package C5_LinkedList;

public class P143_LinkList {
	private P135_Link first;

	public void P135_LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int id, double dd) {
		P135_Link newLink = new P135_Link(id, dd);
		newLink.next = first;
		first = newLink;
	}

	public P135_Link find(int key) {
		P135_Link current = first;
		while (current.iData != key) {
			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}

	public P135_Link delete(int key) {
		P135_Link current = first;
		P135_Link previous = first;
		
		while (current.iData != key) {
			if (current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}

	public void displayList() {
		System.out.print("List fist -> last: ");
		P135_Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

}
