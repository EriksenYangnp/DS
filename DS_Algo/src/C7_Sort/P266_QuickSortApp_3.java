package C7_Sort;

public class P266_QuickSortApp_3 {

	public static void main(String[] args) {
		int maxSize = 16;
		P266_ArrayIns arr = new P266_ArrayIns(maxSize);
		
		for(int j=0; j<maxSize; j++) {
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.display();
		arr.quickSort();
		arr.display();
	}

}
