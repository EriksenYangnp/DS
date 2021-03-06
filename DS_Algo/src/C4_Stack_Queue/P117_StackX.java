package C4_Stack_Queue;

public class P117_StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public P117_StackX(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) {
		stackArray[++top] = j;
	}
	
	public char pop() {
		return stackArray[top--];
	}
	
	public char peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public int size() {
		return top+1;
	}
	
	public char peekN(int n) {
		return stackArray[n];
	}
	
	public void displayStack(String s) {
		System.out.print(s);
		System.out.print("Stack bootom -> top : ");
		for(int j=0; j<size(); j++) {
			System.out.print( peekN(j));
			System.out.print(' ');
		}
		System.out.println(" ");
	}
	
}
