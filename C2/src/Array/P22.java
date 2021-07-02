package Array;

public class P22 {

	public static void main(String[] args) {
		long[] arr;
		arr = new long[100];
		int nElems = 0;
		int j;
		long searchKey;
		
		arr[0] = 77;
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		nElems = 5;
		
		for(j=0; j<nElems; j++) 
			System.out.print(arr[j] + " ");
		System.out.println("");
		
		searchKey = 55;
		for(j=0; j<nElems; j++) 
			if(arr[j] == searchKey)
				break;
		if(j == nElems)
			System.out.println("can't find " + searchKey);
		else
			System.out.println("found " + searchKey);
		
		searchKey = 22;
		for(j=0; j<nElems; j++) 
			if(arr[j] == searchKey)
				break;
		for(int k=j; k<nElems; k++)
			arr[k] = arr[k+1];
		nElems--;
		
		for(j=0; j<nElems; j++) 
			System.out.print(arr[j] + " ");
		System.out.println("");
			
	}

}
