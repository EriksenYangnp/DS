package C4_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P87_ReversApp {

	public static void main(String[] args) throws IOException{
		String input, output;
		while(true) {
			System.out.print("Enter a String: ");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			
			P87_Reverser theReverser = new P87_Reverser(input);
			output = theReverser.doRev();
			System.out.println("theReverser " + output);
		}
	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

}
