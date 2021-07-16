package C11_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleHashTableApp {

	public static void main(String[] args)  throws IOException {
		DataItem aDataItem;
		int aKey, size, n;
		
		System.out.print("Enter size of hash table: ");
		size = getInt();
		System.out.print("Enter initial number of items: ");
		n = getInt();
		
		DoubleHashTable theHashTable = new DoubleHashTable(size);
		for(int j=0; j<n; j++) {
			aKey = (int)(java.lang.Math.random() * 2 * size);
			aDataItem = new DataItem(aKey);
			theHashTable.insert(aKey, aDataItem);
		}
		
		while(true) {
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = getChar();
			switch(choice) {
			case 's' :
				theHashTable.displayTable();
				break;
			case 'i' :
				System.out.print("Enter key value to insert: ");
				aKey = getInt();
				aDataItem = new DataItem(aKey);
				theHashTable.insert(aKey, aDataItem);
				break;
			case 'd' :
				System.out.print("Enter key value to delete: ");
				aKey = getInt();
				theHashTable.delete(aKey);
				break;
			case 'f' :
				System.out.print("Enter key value to find: ");
				aKey = getInt();
				aDataItem = theHashTable.find(aKey);
				if(aDataItem != null) {
					System.out.println("Found : " + aKey);
				}else
					System.out.println("Can't Found : " + aKey);
				break;
			default:
				System.out.print("Invalid entry\n");
			}
		}		
	}
	private static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	private static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	private static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
	
	
	
	

}
