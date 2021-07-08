package C7_Sort;

public class P243_ShellSortApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P243_ArraySh arr = new P243_ArraySh(maxSize);
		
		for(int j=0; j<maxSize; j++) {
			long n = (int)(java.lang.Math.random()*99);
			arr.insert(n);
		}
		arr.displayLink();
		arr.shellSort();
		arr.displayLink();
		
	}

}

