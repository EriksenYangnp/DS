package Array;


public class P40_PersonDataApp {

	public static void main(String[] args) {
		int maxSize = 10;
		P40_PersonData arr = new P40_PersonData(maxSize);
		
		arr.insert("Evens", "Patty", 24);
		arr.insert("Smith", "Lorraine", 24);
		arr.insert("Yee", "Tom", 24);
		arr.insert("Adams", "Henry", 24);
		arr.insert("Alex", "Patty", 24);
		
		arr.displayA();
		System.out.println("-------------------");
		
		String searchKey = "Alex";
		P40_Person found = arr.find(searchKey);
		if(found != null) {
			System.out.print("Found");
			found.displayPerson();
			System.out.println("-------------------");
		}else
			System.out.print(" can't find " + searchKey );
		
		arr.displayA();
		System.out.println("-------------------");
		System.out.println("delete Yee");
		arr.delete("Yee");
		arr.displayA();
		
	}

}
