package C4_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P90_BracketApp {

	public static void main(String[] args) throws IOException {
		String input;
		while(true) {
			System.out.print("Enter String containing delemiters: ");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			
			P90_BracketChecker theCheck = new P90_BracketChecker(input);
			theCheck.check();
		}
	}
	
	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

}
