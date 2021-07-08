package C7_Sort;

public class P247PartitionApp {

	public static void main(String[] args) {
		int maxSize = 16;
		P247_ArrayPar arr = new P247_ArrayPar(maxSize);
		
		for(int j=0; j<maxSize; j++) {
			long n = (int)(java.lang.Math.random()*199);
			arr.insert(n);
		}
		arr.display();
		
		long pivot = 99;
		System.out.print("pivot " + pivot);
		int size = arr.size();
		
		int PartDex = arr.partitionIt(0, size-1, pivot);
		System.out.println(", Partition is at index " + PartDex);
		arr.display();
	}

}
