package graphs;
import java.util.*;
public class graph_client {

	public static void main(String[] args) {
		graph Graph=new graph();
		Graph.addVertex("A");
		Graph.addVertex("B");
		Graph.addVertex("C");
		Graph.addVertex("D");
		Graph.addVertex("E");
		Graph.addVertex("F");
		Graph.addVertex("G");
		
		Graph.addEdge("A", "B", 3);
		Graph.addEdge("A", "D", 2);
		Graph.addEdge("B", "C", 4);
		Graph.addEdge("C", "D", 7);
		Graph.addEdge("D", "E", 10);
		Graph.addEdge("E", "F", 9);
		Graph.addEdge("F", "G", 6);
		Graph.addEdge("E", "G", 8);
		
		Graph.display();
		
		System.out.println(Graph.numEdges());
		System.out.println(Graph.numVertex());
		
		System.out.println(Graph.containsEdge("A","C" ));
		System.out.println(Graph.containsEdge("E", "F"));
		
		Graph.removeEdge("A", "B");
		Graph.display();
		
		Graph.removeVertex("F");
		Graph.display();
		
		Graph.addVertex("F");
		Graph.display();
		
		Graph.addEdge("F", "A", 10);
		Graph.display();
		HashMap<String,Boolean> map=new HashMap<>();
		System.out.println(Graph.hasPath("A","B",map));
		System.out.println(Graph.bfs("A", "B"));
		System.out.println(Graph.dfs("F", "B"));
		Graph.bft();
		Graph.dft();
		System.out.println(Graph.isCyclic());
		System.out.println(Graph.isConnected());
		System.out.println(Graph.isTree());
		System.out.println(Graph.getConnected());
	}

}
