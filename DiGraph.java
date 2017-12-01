package javaProjectNew;

public class DiGraph {
	private int V;
	private int E;
	int[] indegree;
	boolean[] marked;
	LinkedList<Integer>[] adj;
	
	public DiGraph(int V){
		//if(V<0||V>G.V) throw new IllegalArgumentException();
		this.V=V;
		this.E=0;
		indegree=new int[V];
		marked=new boolean[V];
		adj=(LinkedList<Integer>[]) new LinkedList[V];
		for(int v=0;v<V;v++){
			adj[v]=new LinkedList<Integer>();
		}
	}
	
	public int V(){
		return V;
	}
	public int E()
	{
		return E;
	}
	
	public void addEdge(int v,int w){
		validVertex(v);
		validVertex(w);
		adj[v].addAtBegin(w);
		indegree[w]++;
		E++;
	}
	
	public void topologicalOrder(int s){
		
		Queue<Integer> queue=new Queue<Integer>();
		
		for(int v=0;v<V();v++){
			
			if(indegree[v]==0){
				
				queue.enqueue(v);
			}
		}
		
		while(!queue.isEmpty()){
			
			int v=queue.dequeue();
			marked[v]=true;
			System.out.print(v+"  ");
			for(int w:adj[v]){
				indegree[w]--;
				if(!marked[w])
				{
					marked[w]=true;
				}
				if(indegree[w]==0){
					queue.enqueue(w);
				}
			}
			
		}
		System.out.println();
		
	}
	
	public int indegree(int v){
		return indegree[v];
	}
	
	
	public void validVertex(int v){
		
	}
	
	public static void main(String args[]){
		DiGraph G=new DiGraph(8);
		G.addEdge(0, 1);
		G.addEdge(1, 2);
		G.addEdge(2, 3);
		G.addEdge(3, 4);
		G.addEdge(4, 5);
		G.addEdge(3, 5);
		G.addEdge(4,6);
		G.addEdge(5, 6);
		//G.addEdge(3, 7);
		
		for(int v=0;v<G.V();v++)
		{
			System.out.print(v+" : ");
			for(int w:G.adj[v])
			{
				System.out.print(w+"  ");
			}
			System.out.println();
		}
		
	
		G.topologicalOrder(7);
		
		//System.out.println(G.indegree(0));
	}
	
	
	
	
}
