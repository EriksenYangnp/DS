package C4_Stack_Queue;

public class P90_BracketChecker {
	private String input;
	
	public P90_BracketChecker(String in) {
		input = in;
	}
	
	public void check() {
		int stackSize = input.length();
		P90_StackX theStack = new P90_StackX(stackSize);
		
		for(int j=0; j<input.length(); j++) {
			char ch = input.charAt(j);
			switch(ch) {
				case '{':
				case '[':
				case '(':
				theStack.push(ch);
				break;
				
				case '}':
				case ']':
				case ')':
					if( !theStack.isEmpty()) {
						char chx = (char)theStack.pop();
						if( (ch=='}' && chx!='{') || (ch==']' && chx!='[') || (ch==')' && chx!='(') )
							System.out.println("Error: " + ch + " at " + j);
					}
					else
						System.out.println("Error: " + ch + " at " + j);
					break;
					default:
						break;
			}
		}
		if( !theStack.isEmpty())
			System.out.println("Error: missing right delimiter");
	}
	
}
