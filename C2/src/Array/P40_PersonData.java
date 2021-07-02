package Array;

public class P40_PersonData {
	private P40_Person[] a;
	private int nElems;
	
	public P40_PersonData(int max) {
		a = new P40_Person[max];
		nElems = 0;
	}
	
	public P40_Person find(String searchName) {
		int j;
		for(j=0; j<nElems; j++)
			if(a[j].getLast().equals(searchName))
				break;
		if(j == nElems)
			return null;
		else
			return a[j];				
	}
	
	public void insert(String last, String first, int age) {
		a[nElems] = new P40_Person(last, first, age);
		nElems++;
	}
	
	public boolean delete(String searchName) {
		int j;
		for(j=0; j<nElems; j++)
			if(a[j].getLast().equals(searchName))
				break;
		if(j == nElems)
			return false;
		else{
			for(int k=j; k<nElems; k++)
				a[k] = a[k+1];
			nElems--;
			return true;
		}		
	}
	
	public void displayA() {
		for(int j=0; j<nElems; j++)
			a[j].displayPerson();
	}
	
}
