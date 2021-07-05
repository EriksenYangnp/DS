package C5_LinkedList;

public class P169_DoublyLinkedList {
	private P169_Link first;
	private P169_Link last;
	
	public P169_DoublyLinkedList() {
		first = null;
		last = null;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void insertFirst(long dd) {
		P169_Link newLink = new P169_Link(dd);
		if(isEmpty())
			last = newLink;
		else
			first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}
	public void insertLast(long dd) {
		P169_Link newLink = new P169_Link(dd);
		if(isEmpty())
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
	public P169_Link deleteFirst() {
		P169_Link temp = first;
		if(first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}
	public P169_Link deleteLast() {
		P169_Link temp = last;
		if(first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}
	public boolean insertAfter(long key, long dd) {
		P169_Link current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null)
				return false;
		}
		P169_Link newLink = new P169_Link(dd);
		if(current==last) {
			newLink.next = null;
			last = newLink;
		}
		else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}
	public P169_Link deleteKey(long key) {
		P169_Link current = first;
		while(current.dData != key) {
			current = current.next;
			if(current == null)
				return null;
		}
		if(current==first)
			first = current.next;
		else
			current.previous.next = current.next;
		
		if(current==last)
			last = current.previous;
		else
			current.next.previous= current.previous;
		return current;		
	}
	
	public void displayForward() {
		System.out.print("List first -> last: ");
		P169_Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
			System.out.println("");
	}
	public void displayBackward() {
		System.out.print("List last -> first: ");
		P169_Link current = last;
		while(current != null) {
			current.displayLink();
			current = current.previous;
		}
			System.out.println("");
	}
	
	
	
	
}
