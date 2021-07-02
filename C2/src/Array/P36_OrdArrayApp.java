package Array;

public class P36_OrdArrayApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P36_OrdArray arr = new P36_OrdArray(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		
		arr.display();
		int searchKey = 55;
		if(arr.find(searchKey) != arr.size())
			System.out.println("found " + searchKey);
		else
			System.out.println("can't find " + searchKey);
		
		arr.display();
		arr.delete(77);
		arr.display();
	}

}
