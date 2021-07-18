package C13_Graph;

//P474
public class Graph {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	private StackX theStack;

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for (int j = 0; j < MAX_VERTS; j++)
			for (int k = 0; k < MAX_VERTS; k++)
				adjMat[j][k] = 0;
		theStack = new StackX();
	}

	public void addVertex(char lab) {
		vertexList[nVerts++] = new Vertex(lab);
	}

	public void addEdge(int start, int end) { // if connect update to [1,1]
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}

	public void dfs() {
		vertexList[0].wasVisited = true;
		displayVertex(0);
		theStack.push(0);

		while (!theStack.isEmpty()) {
			int v = getAdjUnvisitedVertex(theStack.peek()); // peak
			if (v == -1)
				theStack.pop(); // no more unVisited one
			else {
				vertexList[v].wasVisited = true; // find new connect one push to stack
				displayVertex(v);
				theStack.push(v);
			}
		}
		for (int j = 0; j < nVerts; j++) // reset all flag
			vertexList[j].wasVisited = false;

	}

	private int getAdjUnvisitedVertex(int v) {
		for (int j = 0; j < nVerts; j++)
			if (adjMat[v][j] == 1 && vertexList[j].wasVisited == false) // find connect with peak's one
				return j;
		return -1; // can't found unvisited(end of this path), return -1
	}

	// P487
	public void mst() {
		vertexList[0].wasVisited = true;
		theStack.push(0);

		while (!theStack.isEmpty()) {
			int currentVertex = theStack.peek();
			int v = getAdjUnvisitedVertex(currentVertex);
			if (v == -1)
				theStack.pop();
			else {
				vertexList[v].wasVisited = true;
				theStack.push(v);
				displayVertex(currentVertex);
				displayVertex(v);
				System.out.print(" ");
			}
		}
		for (int j = 0; j < nVerts; j++) // reset all flag
			vertexList[j].wasVisited = false;
	}
}
