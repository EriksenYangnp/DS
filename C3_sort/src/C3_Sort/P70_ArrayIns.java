package C3_Sort;

public class P70_ArrayIns {
	private long[] a;
	private int nElems;

	public P70_ArrayIns(int max) {
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public void disploy() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
			System.out.println("");
		}
	}

	public void insertionSort() {
		int out, in;

		for (out = 1; out < nElems; out++) {
			long temp = a[out]; // 出列
			in = out;
			while (in > 0 && a[in - 1] >= temp) {
				a[in] = a[in - 1]; // 右移
				--in;
			}
			a[in] = temp; // 人列
		}
	}

}
