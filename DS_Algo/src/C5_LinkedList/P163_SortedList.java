package C5_LinkedList;

public class P163_SortedList {
	private P147_Link first;
	
	public P163_SortedList() {
		first = null;
	}
	public P163_SortedList(P147_Link[] linkArr) {
		first = null;
		for(int j=0; j<linkArr.length; j++)
			insert(linkArr[j]);
	}
	public void insert(P147_Link k) {
		P147_Link previous = null;
		P147_Link current = first;
		
		while(current != null && k.dData > current.dData) {
			previous = current;
			current= current.next;
		}
		if(previous==null)
			first = k;
		else
			previous.next = k;
		k.next = current;
	}
	public P147_Link remove() {
		P147_Link temp = first;
		first = first.next;
		return temp;
	}
	
	
}
