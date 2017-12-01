package javaProjectNew;


public class DFS {
	boolean[] marked;
	int V;
	int E;
	
	public DFS(Graph G,int x){
		this.V=G.V();
		this.E=G.E();
		marked=new boolean[V];
		
		dfs(G,x);
	
	}
	public void dfs(Graph G,int v){
		validVertex(v);
		
		marked[v]=true;
		for(int w:	G.adj(v))
		{
			if(!marked[w]){
			dfs(G,w);
			}
		}
	
	}
	public void validVertex(int v){
		if(v<0||v>V) {
			System.out.println("this is not a valid vertex");
		}
	}
	
	public boolean marked(int v){
		return marked[v];
	}
}
