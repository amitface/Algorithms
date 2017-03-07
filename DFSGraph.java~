
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class DFSGraph{

	 boolean[] visited = new boolean[10];
	 Vector  adj[]=new Vector[10];
	
	void dfs(int s) {
	    visited[s] = true;
	    for(int i = 0;i < adj[s].size();++i)    {
	     if(visited[adj[s][i]] == false)
		 dfs(adj[s][i]);
	    }
	}

	void initialize() {
	    for(int i = 0;i < 10;++i)
	     visited[i] = false;
	}

	public static void  main(String []args) {
	    int nodes, edges, x, y, connectedComponents = 0;
		Scanner in = new Scanner(System.in);
	     nodes=in.nextInt();                       // Number of nodes
	     edges=in.nextInt();                       // Number of edges
		DFSGraph dfs=new DFSGraph();
	    for(int i = 0;i < edges;++i) {
	     x=in.nextInt(); y=in.nextInt();     
	 // Undirected Graph 
	     dfs.adj[x].push_back(y);                   // Edge from vertex x to vertex y
	     dfs.adj[y].push_back(x);                   // Edge from vertex y to vertex x
	    }

	    initialize();                           // Initialize all nodes as not visited

	    for(int i = 1;i <= nodes;++i) {
	     if(visited[i] == false)     {
		 dfs(i);
		 connectedComponents++;
	     }
	    }
	    System.out.println("Number of connected components: " + connectedComponents);
	    
	}
}
