package C5_LinkedList;

public class P177_ListIterator {
	private P147_Link current;
	private P147_Link previous;
	private P177_LinkList ourList;
	
	public P177_ListIterator(P177_LinkList list) {
		ourList = list;
		reset();
	}
	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	public boolean atEnd() {
		return current.next == null;
	}
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	public P147_Link getCurrent() {
		return current;
	}
	public void insertAfter(long dd) {
		P147_Link newLink = new P147_Link(dd);
		if(ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		}
		else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	public void insertBefor(long dd) {
		P147_Link newLink = new P147_Link(dd);
		if(previous == null) {
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}
		else {
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	public long deleteCurent() {
		long value = current.dData;
		if(previous == null) {
			ourList.setFirst(current.next);
			reset();
		}
		else {
			previous.next = current.next;
			if( atEnd())
				reset();
			else
				current = current.next;
		}
		return value;
	}
	
}
