package C7_Sort;

public class P243_ArraySh {
	private long[] theArray;
	private int nElems;
	
	public P243_ArraySh(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}
	public void displayLink() {
		System.out.print("A=");
		for(int j=0; j<nElems; j++)
			System.out.print(theArray[j] + " ");
		System.out.println();
	}
	public void shellSort() {
		int inner, outer;
		long temp;
		
		int h = 1;
		while(h <= nElems/3)
			h = h*3 + 1;
		while(h>0) {
			for(outer=h; outer<nElems; outer++) { //增量为h， h-> 右移, break when outer=n
				temp = theArray[outer];
				inner = outer;
				while(inner > h-1 && theArray[inner-h] >= temp) {//check h 步长， when 左边<右边， 交换
					theArray[inner] = theArray[inner-h]; //when inner<h-1 break
					inner -= h;  //8,4,0 //when h=1 1,2,3...
				}
				theArray[inner] = temp;
			}
			h = (h-1) / 3; //start from h=1  again
		}
	}
	
}
