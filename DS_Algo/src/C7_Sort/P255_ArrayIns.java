package C7_Sort;

public class P255_ArrayIns {
	private long[] theArray;
	private int nElems;
	
	public P255_ArrayIns(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}
	public void display() {
		System.out.print("A=");
		for(int j=0; j<nElems; j++)
			System.out.print(theArray[j] + " ");
		System.out.println();
	}
	public void quickSort() {
		recQuickSort(0, nElems-1);
	}
	public void recQuickSort(int left, int right) {
		if(right-left <= 0)
			return;
		else {
			long pivot = theArray[right];
			int partition = partition(left, right, pivot);
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);
		}
	}
	private int partition(int left, int right, long pivot) {
		int leftPtr = left -1; 
		int rightPtr = right;
		while(true) {
			while(theArray[++leftPtr] < pivot)
				;
			while(right > 0 && theArray[--rightPtr] > pivot)
				;
			if(leftPtr >= rightPtr) //cross
				break;
			else
				swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right); //restore pivot
		return leftPtr;
	}
	private void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
}//258
