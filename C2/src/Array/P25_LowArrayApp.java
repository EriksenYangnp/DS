package Array;

public class P25_LowArrayApp {

	public static void main(String[] args) {
		P25_LowArray arr = new P25_LowArray(10);
		int nElems = 0;
		int j;
		
		arr.setElem(0, 77);
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		nElems = 5;
		
		for(j=0; j<nElems; j++) 
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
		
		int searchKey = 26;
		for(j=0; j<nElems; j++) 
			if(arr.getElem(j) == searchKey)
				break;
		if(j == nElems)
			System.out.println("can't find " + searchKey);
		else
			System.out.println("found " + searchKey);
		
	
		for(j=0; j<nElems; j++) 
			if(arr.getElem(j) == 55)
				break;
		for(int k=j; k<nElems; k++)
			arr.setElem(k, arr.getElem(k+1));
		nElems--;
		
		for(j=0; j<nElems; j++) 
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
	}

}
