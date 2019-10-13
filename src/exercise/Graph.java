package exercise;

import java.util.LinkedList; 
class Graph { 
	 int numVertices; 
	 LinkedList<Integer>[] adjArray; 

	 Graph(int numVertices) { 
	     this.numVertices = numVertices; 
	     adjArray = new LinkedList[numVertices]; 
	     
	     for(int i = 0; i < numVertices ; i++){ 
	         adjArray[i] = new LinkedList<Integer>(); 
	     } 
	 } 

	 void addEdge( int src, int dest) { 
	     adjArray[src].add(dest); 
	     adjArray[dest].add(src); 
	 } 
	   
	 void depthFirst(int numVertices, boolean[] visited) { 
	     visited[numVertices] = true; 
	     System.out.print(numVertices+" "); 

	     for (int x : adjArray[numVertices]) { 
	         if(!visited[x]) depthFirst(x,visited); 
	     } 
	
	 } 
	 void traverse() { 
	     boolean[] visited = new boolean[numVertices]; 
	     for(int v = 0; v < numVertices; ++v) { 
	         if(!visited[v]) { 
	             depthFirst(v,visited); 
	             System.out.println(); 
	         } 
	     } 
	 } 
	   
	   

public static void main(String[] args){ 

	     Graph g = new Graph(5);
	       
	     g.addEdge(1, 0);  
	     g.addEdge(1, 2);  
	     g.addEdge(3, 4);
	     g.traverse(); 
} 
}     