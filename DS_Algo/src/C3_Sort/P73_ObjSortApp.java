package C3_Sort;

public class P73_ObjSortApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P73_ArrayInOb arr = new P73_ArrayInOb(maxSize);
		
		arr.insert("Evens", "Patty", 24);
		arr.insert("Smith", "Lorraine", 24);
		arr.insert("Yee", "Tom", 24);
		arr.insert("Adams", "Henry", 24);
		arr.insert("Alex", "Patty", 24);
		
		arr.display();
		System.out.println("-------insertionSort-----------");
		arr.insertionSort();		
		arr.display();
		
	
		
	}

}
