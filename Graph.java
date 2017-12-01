package javaProjectNew;

import java.util.Iterator;

public class Graph {

	private final int V;
	private int E;
	private   LinkedList<Integer>[] adj;
	
	public Graph(int V){
		this.V=V;
		this.E=0;
		adj=(LinkedList<Integer>[]) new LinkedList[V];
		for(int v=0;v<V;v++){
			adj[v]=new LinkedList<Integer>();
		}
	}
	public Graph(Graph G){
		this.V=G.V();
		this.E=G.E();
		
		Stack<Integer> reverse=new Stack<Integer>();
		for(int v=0;v<G.V();v++){
			
		  for(int w :adj[v]){
			  reverse.push(w);
		  }
		  for(int w:reverse){
			  G.adj[v].addAtBegin(w);
		  }
			
		}
	}
	public int V(){
		return V;
	}
	public int E(){
		return E;
	}
	
	public void addEdge(int v,int w){
		validVertex(v);
		validVertex(w);
		adj[v].addAtBegin(w);
		adj[w].addAtBegin(v);
		E++;
	}
	public void validVertex(int v){
		if(v<0||v>V()) throw new IllegalArgumentException("these is not valid vertices");
	}
	public int degree(int v){
		return adj[v].size();
	}
	public Iterable<Integer> adj(int v){
		validVertex(v);
		return adj[v];
	}
	
	
	
	
	public static void main(String args[]){
		Graph G=new Graph(8);
		G.addEdge(0, 1);
		G.addEdge(2,3);
		G.addEdge(5,3 );
		G.addEdge(5,4);
		G.addEdge(6, 4);
		//G.addEdge(4, 7);
		G.addEdge(1, 2);
		System.out.println("Edges are :"+G.E()+"  vertices are :"+G.V());
		for(int v=0;v<G.V();v++){
			System.out.print(v+": ");
			for(int w:G.adj[v]){
				System.out.print(w+" ");
			}
			System.out.println();
		}
		
		System.out.println("DFS order");
		
		/*DFS dfs=new DFS(G,2);
		for(int v=0;v<G.V();v++)
		{
			
			if(dfs.marked[v]==true)
			{
			  System.out.print(v+ "  ");
			}
			
		}*/
		BFS bfs=new BFS(G,1);
		for(int v=0;v<G.V();v++)
		{
			
			if(bfs.marked[v]==true)
			{
			  System.out.print(v+ "  ");
			}
			
		}
		//System.out.println(bfs.distTo(7));
		
	}
}
