package C6_Rec;

public class P202_BinarySearchApp {

	public static void main(String[] args) {
		int maxSize = 100;
		P202_ordArray arr = new P202_ordArray(maxSize);
		
		arr.insert(72);
		arr.insert(90);
		arr.insert(45);
		arr.insert(126);
		arr.insert(54);
		arr.insert(99);
		arr.insert(144);
		arr.insert(27);
		arr.display();
		
		int searchKey = 27;
		if(arr.find(searchKey) != arr.size())
			System.out.println("Found " + searchKey);
		else 
			System.out.println("Can't Found " + searchKey);
	}

}
