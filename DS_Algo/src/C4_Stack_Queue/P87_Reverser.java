package C4_Stack_Queue;

public class P87_Reverser {
	private String input;
	private String output;
	
	public P87_Reverser(String in) {
		input = in;
	}
	
	public String doRev() {
		int stackSize = input.length();
		P84_StackX theStack = new P84_StackX(stackSize);
		
		for(int j=0; j<input.length(); j++) {
			char ch = input.charAt(j);
			theStack.push(ch);
		}
		output =  "";
		while( !theStack.isEmpty()) {
			char ch = (char) theStack.pop();
			output += ch;
		}
		return output;
	}
	
}
