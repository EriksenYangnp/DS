package C3_Sort;
public class P63_SelectSortApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P63_ArraySel arr = new P63_ArraySel(maxSize);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		
		arr.disploy();
		System.out.println("---------SelectSort");
		arr.selectionSort();
		arr.disploy();
		
	}

}
