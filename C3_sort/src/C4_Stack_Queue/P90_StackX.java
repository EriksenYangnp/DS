package C4_Stack_Queue;

public class P90_StackX {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public P90_StackX(int s) {
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) {
		stackArray[++top] = j;
	}
	
	public long pop() {
		return stackArray[top--];
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
}
