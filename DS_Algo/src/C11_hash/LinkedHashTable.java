package C11_hash;
//P418
public class LinkedHashTable {
	private SortedList[] hashArray;
	private int arraySize;
	
	public LinkedHashTable(int size) {
		arraySize = size;
		hashArray = new SortedList[arraySize];
		for(int j=0; j<arraySize; j++)
			hashArray[j] = new SortedList();
	}
	public void displayTable() {
		for(int j=0; j<arraySize; j++) {
			System.out.print(j + ". ");
			hashArray[j].displayList();
		}
	}
	public int hashFunc(int key) {
		return key % arraySize;
	}
	public void insert(Link thelink) {
		int key = thelink.getKey();
		int hashVal =  hashFunc(key);
		hashArray[hashVal].insert(thelink);
	}
	public void delete(int key) {
		int hashVal = hashFunc(key);
		hashArray[hashVal].delete(key);
	}
	public Link find(int key) {
		int hashVal = hashFunc(key);
		Link theLink = hashArray[hashVal].find(key);
		return theLink;
	}
	
}
