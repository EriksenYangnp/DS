package Array;

public class P25_LowArray {
	private long[] a;
	
	public P25_LowArray(int size) {
		a = new long[size];
	}
	
	public void setElem(int index, long value) {
		a[index] = value;
	}
	
	public long getElem(int index) {
		return a[index];
	}

}
