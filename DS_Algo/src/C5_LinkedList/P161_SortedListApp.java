package C5_LinkedList;

public class P161_SortedListApp {

	public static void main(String[] args) {
		P161_SortedList thelist = new P161_SortedList();
		
		thelist.insert(20);
		thelist.insert(40);
		thelist.displayList();
		
		thelist.insert(10);
		thelist.insert(30);
		thelist.insert(50);
		thelist.displayList();
		
		thelist.remove();
		thelist.displayList();
	}

}
