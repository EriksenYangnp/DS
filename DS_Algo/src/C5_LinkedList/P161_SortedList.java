package C5_LinkedList;

public class P161_SortedList {
	private P147_Link first;
	public P161_SortedList() {
		first = null;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void insert(long key) {
		P147_Link newLink = new P147_Link(key);
		P147_Link previous = null;
		P147_Link current  = first;
		
		while(current != null && key > current.dData) {
			previous = current;
			current = current.next;
		}
		if(previous==null)
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}
	public P147_Link remove() {
		P147_Link temp = first;
		first = first.next;
		return temp;
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
