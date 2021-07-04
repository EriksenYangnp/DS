package C4_Stack_Queue;

public class P84_StackApp {

	public static void main(String[] args) {
		P84_StackX theStack = new P84_StackX(5);
		
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while( !theStack.isEmpty()) {
			System.out.print(theStack.pop());
			System.out.print(" ");
		}
		System.out.println("");
	}

}
