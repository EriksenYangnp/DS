package C7_Sort;

public class P262_QuickSortApp_2 {

	public static void main(String[] args) {
		int maxSize = 16;
		P262_ArrayIns arr = new P262_ArrayIns(maxSize);
		
		for(int j=0; j<maxSize; j++) {
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();
		arr.display();
	}

}
