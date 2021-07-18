package C13_Graph;

public class BFSApp {

	public static void main(String[] args) {
		Graph_BFS theGraph = new Graph_BFS();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		
		System.out.print("Visistes: ");
		theGraph.bfs();
		System.out.println();
	}
}
