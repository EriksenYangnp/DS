package C6_Rec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P224_StackTriangleApp {
	static int theNumber;
	static int theAnswer;
	static P224_StackX theStack;
	static int codePart;
	static P224_Params theseParams;
	
	public static void main(String[] args) throws IOException {
		System.out.print("Enter a number: ");
		theNumber = getInt();
		reTriangle();
		System.out.println("Triangle="+theAnswer);
	}
	private static void reTriangle() {
		theStack = new P224_StackX(1000);
		codePart = 1;
		while(step() == false)
			;
	}
	private static boolean step() {
		switch(codePart) {
			case 1:
				theseParams = new P224_Params(theNumber, 6);
				theStack.push(theseParams);
				codePart = 2;
				break;
			case 2:
				theseParams = theStack.peek();
				if(theseParams.n == 1) {
					theAnswer = 1;
					codePart = 5;
				}else
					codePart = 3;
				break;
			case 3:
				P224_Params newParams = new P224_Params(theseParams.n -1, 4);
				theStack.push(newParams);
				codePart = 2;
				break;
			case 4:
				theseParams = theStack.peek();
				theAnswer = theAnswer + theseParams.n;
				codePart = 5;
				break;
			case 5:
				theseParams = theStack.peek();
				codePart = theseParams.returnAddress;
				theStack.pop();
				break;
			case 6:
				return true;												
		}
		return false;
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
