package C3_Sort;
public class P57_BubbleSortApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P57_ArrayBub arr = new P57_ArrayBub(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		
		arr.disploy();
		System.out.println("---------bubbleSort");
		arr.bubbleSort();
		arr.disploy();
		
	}

}
