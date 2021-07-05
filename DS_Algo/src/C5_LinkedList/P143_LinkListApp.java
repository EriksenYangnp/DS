package C5_LinkedList;

public class P143_LinkListApp {

	public static void main(String[] args) {
		P143_LinkList theList = new P143_LinkList();
		
		theList.insertFirst(22, 2.99);
		theList.insertFirst(44, 4.99);
		theList.insertFirst(66, 6.99);
		theList.insertFirst(88, 8.99);
		
		theList.displayList();
		
		P135_Link f = theList.find(44);
		if( f != null) 
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can't found link with key ");
		
		P135_Link d = theList.delete(66);
		if( d != null) 
			System.out.println("Delete link with key " + d.iData);
		else
			System.out.println("Can't delete link with key ");
		
		theList.displayList();
	}

}
