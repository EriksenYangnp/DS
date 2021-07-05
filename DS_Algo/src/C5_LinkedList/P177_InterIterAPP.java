package C5_LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P177_InterIterAPP {

	public static void main(String[] args) throws IOException{
		P177_LinkList theList = new P177_LinkList();
		P177_ListIterator iter1 = theList.getiterator();
		long value;
		
		iter1.insertAfter(20);
		iter1.insertAfter(40);
		iter1.insertAfter(60);
		iter1.insertAfter(80);
		
		while(true) {
			System.out.print("Enter first leter of show, reset, ");
			System.out.print("newt, get, before, after, delete:  ");
			System.out.flush();
			int choice = getChar();
			switch(choice) {
				case 's':
				if( !theList.isEmpty())
					theList.displayList();
				else
					System.out.println("List is empty");
				break;
				case 'r':
					iter1.reset();
					break;
				case 'n':
					if( !theList.isEmpty() && !iter1.atEnd())
						iter1.nextLink();
					else
						System.out.println("Can't go to next link");
					break;
				case 'g':
					if( !theList.isEmpty()) {
						value = iter1.getCurrent().dData;
						System.out.println("returned " + value);
					}
					else
						System.out.println("List is empty");
					break;
				case 'b':
					System.out.print("Enter value to insert: ");
					System.out.flush();
					value = getInt();
					iter1.insertBefor(value);
					break;
				case 'a':
					System.out.print("Enter value to insert");
					System.out.flush();
					value = getInt();
					iter1.insertAfter(value);
					break;
				case 'd':
					if( !theList.isEmpty()) {
						value = iter1.deleteCurent();
						System.out.print("Deleter " + value);
					}
					else
						System.out.println("can't delete");
					break;
				default:
					System.out.println("invalid entry");	
			}
		}
	}
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	public static char getChar() throws IOException{
		String s = getString();
		return s.charAt(0);
	}
	public static int getInt() throws IOException{
		String s = getString();
		return Integer.parseInt(s);
	}
}
