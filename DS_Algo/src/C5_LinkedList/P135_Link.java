package C5_LinkedList;

public class P135_Link {
	public int iData;
	public double dData;
	public P135_Link next;
	
	public P135_Link(int id, double dd) {
		iData = id;
		dData = dd;
	}
	
	public void displayLink() {
		System.out.print(" iData " +iData+ " dData " + dData);
	}
}
