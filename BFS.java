package javaProjectNew;

public class BFS {
	private final int INFINITY=Integer.MAX_VALUE;
	
	boolean[] marked;
	int[] edgeTo;
	int[] distTo;
	
	public BFS(Graph G,int s){
		marked=new boolean[G.V()];
		edgeTo=new int[G.V()];
		distTo=new int[G.V()];
		validVertex(s);
		for(int v=0;v<G.V();v++){
			distTo[v]=INFINITY;
			
		}
		bfs(G,s);
		
	}
	
	public void bfs(Graph G,int s){
		Queue<Integer> queue=new Queue<Integer>();
		marked[s]=true;
		for(int i=0;i<G.V();i++)
		{distTo[i]=INFINITY;}
		
		distTo[s]=0;
		queue.enqueue(s);
		
		while(!queue.isEmpty()){
			int v;
			
			
			v=queue.dequeue();
			
			for(int w:G.adj(v))
			if(!marked[w])
			{
				queue.enqueue(w);
				marked[w]=true;
				edgeTo[w]=v;
				distTo[w]=distTo[v]+1;
				
			}
			
		}
		
	}
	
	public void validVertex(int v){
		 
		
	}
	public int distTo(int v){
		return distTo[v];
	}

}
