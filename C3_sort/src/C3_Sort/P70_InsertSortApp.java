package C3_Sort;
public class P70_InsertSortApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P70_ArrayIns arr = new P70_ArrayIns(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		
		arr.disploy();
		System.out.println("---------insertionSort");
		arr.insertionSort();
		arr.disploy();
		
	}

}
