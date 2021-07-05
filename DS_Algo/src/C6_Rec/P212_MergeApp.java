package C6_Rec;

public class P212_MergeApp {

	public static void main(String[] args) {
		int[] arryA = {23,47,81,95};
		int[] arryB = {7,14,39,55,62,74};
		int[] arryC = new int[10];
		
		merge(arryA, 4, arryB, 6, arryC);
		display(arryC, 10);
	}
	private static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		int aDex=0, bDex=0, cDex=0; 
		while(aDex < sizeA && bDex < sizeB)
			if(arrayA[aDex] < arrayB[bDex])
				arrayC[cDex++] = arrayA[aDex++];
			else
				arrayC[cDex++] = arrayB[bDex++];
		while(aDex < sizeA)
			arrayC[cDex++] = arrayA[aDex++];
		while(bDex < sizeB)
			arrayC[cDex++] = arrayB[bDex++];
	}
	private static void display(int[] theArray, int size) {
		for(int j=0; j<size; j++)
			System.out.print(theArray[j] + " ");
		System.out.println("");
	}
}
