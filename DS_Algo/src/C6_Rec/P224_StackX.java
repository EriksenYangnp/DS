package C6_Rec;

public class P224_StackX {
	private int maxSize;
	private P224_Params[] stackArray;
	private int top;
	
	public P224_StackX(int s) {
		maxSize = s;
		stackArray = new P224_Params[maxSize];
		top = -1;
	}
	public void push(P224_Params p) {
		stackArray[++top] = p;
	}
	public P224_Params pop() {
		return stackArray[top--];
	}
	public P224_Params peek() {
		return stackArray[top];
	}
}
