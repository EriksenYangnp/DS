package C6_Rec;

public class P229_StackX {
	private int maxSize;
	private int[]  stackArray;
	private int top;
	
	public P229_StackX(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}
	public void push(int p) {
		stackArray[++top] = p;
	}
	public int pop() {
		return stackArray[top--];
	}
	public int peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return top == -1;
	}
}
