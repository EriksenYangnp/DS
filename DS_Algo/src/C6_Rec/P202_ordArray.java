package C6_Rec;

public class P202_ordArray {
	private long[] a;
	private int nElems;
	
	public P202_ordArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	public int size() {
		return nElems;
	}
	public int find(long searchKey) {
		return recFind(searchKey, 0, nElems-1);
	}
	private int recFind(long searchKey, int lowerBound, int uppererBound) {
		int curIn = (lowerBound + uppererBound) / 2;
		if(a[curIn]== searchKey)
			return curIn;
		else if(lowerBound > uppererBound)
				return nElems;
		else {
			if(a[curIn] < searchKey)
				return recFind(searchKey, curIn+1, uppererBound);
			else
				return recFind(searchKey, lowerBound, curIn-1);
		}		
	}
	public void insert(long value) {
		int j;
		for(j=0; j<nElems; j++)
			if(a[j]>value)
				break;
		for(int k=nElems; k>j; k--)
			a[k] = a[k-1];
		a[j] = value;
		nElems++;
	}
	public void display() {
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");
	}
	
}
