package C6_Rec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P229_StackTriangleApp {
	static int theNumber;
	static int theAnswer;
	static P229_StackX theStack;
	
	public static void main(String[] args) throws IOException {
		System.out.print("Enter a number: ");
		theNumber = getInt();
		stackTriangle();
		System.out.println("Triangle="+theAnswer);
	}
	private static void stackTriangle() {
		theStack = new P229_StackX(1000);
		theAnswer = 0;
		
		while(theNumber > 0) {
			theStack.push(theNumber);
			--theNumber;
		}
		while ( !theStack.isEmpty()) {
			int newN = theStack.pop();
			theAnswer += newN;
		}
	}
	
	private static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	private static int getInt() throws IOException{
		String s = getString();
		return Integer.parseInt(s);
	}
}
