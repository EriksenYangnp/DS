package C5_LinkedList;

public class P163_ListinsertionSortApp {

	public static void main(String[] args) {
		int size = 10;
		P147_Link[] linkArray = new P147_Link[size];
		
		for(int j=0; j<size; j++) {
			int n= (int)(java.lang.Math.random()*99);
			P147_Link newLink = new P147_Link(n);
			linkArray[j] = newLink;
		}
		
		System.out.print("Unsorted Array: ");
		for(int j=0; j<size; j++)
			System.out.print(linkArray[j].dData + " ");
		System.out.println("");
		
		P163_SortedList theSortedList = new P163_SortedList(linkArray);
		for(int j=0; j<size; j++)
			linkArray[j] = theSortedList.remove();
		
		System.out.print("sorted Array: ");
		for(int j=0; j<size; j++)
			System.out.print(linkArray[j].dData + " ");
		System.out.println("");
	}

}
