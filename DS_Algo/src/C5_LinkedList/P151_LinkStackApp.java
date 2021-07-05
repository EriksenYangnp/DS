package C5_LinkedList;

public class P151_LinkStackApp {

	public static void main(String[] args) {
		P151_LinkStack theStack = new P151_LinkStack();
		
		theStack.push(20);
		theStack.push(40);
		theStack.displayStack();
		theStack.push(60);
		theStack.push(80);
		theStack.displayStack();
		theStack.pop();
		theStack.pop();
		theStack.displayStack();
		
	}

}
