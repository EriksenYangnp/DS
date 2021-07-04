package C4_Stack_Queue;

public class P106_PriorityQApp {

	public static void main(String[] args) {
		P106_PriorityQ thePQ = new P106_PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		while( !thePQ.isEmpty()) {
			long item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.print(" ");
	}

}
