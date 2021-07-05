package C5_LinkedList;

public class P155_FirstLastList {
	private P147_Link first;
	private P147_Link last;
	
	public P155_FirstLastList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
		
	public void insertLast(long dd) {
		P147_Link newLink = new P147_Link(dd);
		if( isEmpty() )
			first = newLink;
		else
			last.next = newLink;
		last = newLink;   //header's last -> newLink
	}
	
	public long deleteFirst() {
		long temp = first.dData;
		if(first.next == null)
			last = null;
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
