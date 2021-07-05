package C5_LinkedList;

public class P155_LinkQueueApp {

	public static void main(String[] args) {
		P155_LinkQueue theQ = new P155_LinkQueue();
		theQ.insert(20);
		theQ.insert(40);
		theQ.displyQueue();
		
		theQ.insert(60);
		theQ.insert(80);
		theQ.displyQueue();
		
		theQ.remove();
		theQ.remove();
		theQ.displyQueue();
	}

}
