package Array;

public class P28_HighArrayApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P28_HighArray arr = new P28_HighArray(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		
		arr.display();
		int searchKey = 35;
		if( arr.find(searchKey))
			System.out.println("can't find " + searchKey);
		else
			System.out.println("found " + searchKey);
		
		arr.delete(22);
		arr.delete(55);
		arr.delete(77);
		arr.display();
	}
}
