package C5_LinkedList;

public class P147_FirstLastApp {

	public static void main(String[] args) {
		P147_FirstLastList theList = new P147_FirstLastList();
		
		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		
		theList.insertLast(11);
		theList.insertLast(33);
		theList.insertLast(55);
		
		theList.displayList();
		
		theList.deleteFirst();
		theList.deleteFirst();
		
		theList.displayList();
		
	}

}
