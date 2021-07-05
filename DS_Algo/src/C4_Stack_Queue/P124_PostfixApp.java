package C4_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P124_PostfixApp {

	public static void main(String[] args) throws IOException {
		String input;
		int output;
		
		while(true) {
			System.out.print("Enter infix: ");
			System.out.flush();
			input = getString();
			if( input.equals(""))
				break;
			
			P124_ParsePost aParser = new P124_ParsePost(input);
			output = aParser.doParse();
			System.out.println("Postfix is " +output+ '\n');
		}
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
