package C5_LinkedList;

public class P135_LinkListApp {

	public static void main(String[] args) {
		P135_LinkList theList = new P135_LinkList();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList();
		
		while( !theList.isEmpty()) {
			P135_Link aLink = theList.deleteFirst();
			System.out.print("delete ");
			aLink.displayLink();
			System.out.println("");	
		}
		theList.displayList();
	}

}
