package C13_Graph;

public class Graph_Topo {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	private char sortedArray[];
	
	public Graph_Topo() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for (int j = 0; j < MAX_VERTS; j++)
			for (int k = 0; k < MAX_VERTS; k++)
				adjMat[j][k] = 0;
		sortedArray = new char[MAX_VERTS];
	}
	public void addVertex(char lab) {
		vertexList[nVerts++] = new Vertex(lab);
	}
	public void addEdge(int start, int end) { // if connect update to [1,1]
		adjMat[start][end] = 1;
	}

	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}
	
	public void topo() {
		int orig_nVerts = nVerts;
		while(nVerts > 0) {
			int currentVertex = noSuccessors();
			if(currentVertex == -1) {
				System.out.print("EEROR : Graph has cycle");
				return;
			}
			sortedArray[nVerts-1] = vertexList[currentVertex].label;
			deleteVertex(currentVertex);
		}
		System.out.print("Topologicallly sorted order: ");
		for (int j = 0; j < orig_nVerts; j++) // reset all flag
			System.out.print(sortedArray[j]);
		System.out.println(" ");
	}
	private int noSuccessors() {
		boolean isEdge;
		for(int row=0; row<nVerts; row++) {
			isEdge = false;
			for(int col=0; col<nVerts; col++) {
				if(adjMat[row][col] > 0) {
					isEdge = true;
					break;
				}
			}
			if(!isEdge)
				return row;
		}
		return -1;
	}
	private void deleteVertex(int delVert) {
		if(delVert != nVerts-1) {
			for(int j=delVert; j<nVerts-1; j++)
				vertexList[j] = vertexList[j+1];
			
			for(int row=delVert; row<nVerts-1; row++)
				moveRowUp(row, nVerts);
			
			for(int col=delVert; col<nVerts-1; col++)
				moveColLeft(col, nVerts-1);
			
		}
		nVerts--;
	}
	private void moveRowUp(int row, int length) {
		for(int col=0; col<length; col++)
			adjMat[row][col] = adjMat[row+1][col];
	}
	private void moveColLeft(int col, int length) {
		for(int row=0; row<length; row++)
			adjMat[row][col] = adjMat[row][col+1];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
