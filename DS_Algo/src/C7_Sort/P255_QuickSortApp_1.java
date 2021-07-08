package C7_Sort;

public class P255_QuickSortApp_1 {

	public static void main(String[] args) {
		int maxSize = 16;
		P255_ArrayIns arr = new P255_ArrayIns(maxSize);
		
		for(int j=0; j<maxSize; j++) {
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();
		arr.display();
	}

}
