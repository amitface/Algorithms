
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class kruskal
{
	private static final double FLOATING_POINT_EPSILON = 1E-12;

    private double weight;                        // weight of MST
    private Queue<Edge> mst = new Queue<Edge>();  // edges in MST

    /**
     * Compute a minimum spanning tree (or forest) of an edge-weighted graph.
     * @param G the edge-weighted graph
     */
    public kruskal(EdgeWeightedGraph G) {
        // more efficient to build heap by passing array of edges
        MinPQ<Edge> pq = new MinPQ<Edge>();
        for (Edge e : G.edges()) {
            pq.insert(e);
        }

        // run greedy algorithm
        UF uf = new UF(G.V());
        while (!pq.isEmpty() && mst.size() < G.V() - 1) {
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);
            if (!uf.connected(v, w)) { // v-w does not create a cycle
                uf.union(v, w);  // merge v and w components
                mst.enqueue(e);  // add edge e to mst
                weight += e.weight();
            }
        }

        // check optimality conditions
        assert check(G);
    }

    /**
     * Returns the edges in a minimum spanning tree (or forest).
     * @return the edges in a minimum spanning tree (or forest) as
     *    an iterable of edges
     */
    public Iterable<Edge> edges() {
        return mst;
    }

    /**
     * Returns the sum of the edge weights in a minimum spanning tree (or forest).
     * @return the sum of the edge weights in a minimum spanning tree (or forest)
     */
    public double weight() {
        return weight;
    }
    
    // check optimality conditions (takes time proportional to E V lg* V)
    private boolean check(EdgeWeightedGraph G) {

        // check total weight
        double total = 0.0;
        for (Edge e : edges()) {
            total += e.weight();
        }
        if (Math.abs(total - weight()) > FLOATING_POINT_EPSILON) {
            System.err.printf("Weight of edges does not equal weight(): %f vs. %f\n", total, weight());
            return false;
        }

        // check that it is acyclic
        UF uf = new UF(G.V());
        for (Edge e : edges()) {
            int v = e.either(), w = e.other(v);
            if (uf.connected(v, w)) {
                System.err.println("Not a forest");
                return false;
            }
            uf.union(v, w);
        }

        // check that it is a spanning forest
        for (Edge e : G.edges()) {
            int v = e.either(), w = e.other(v);
            if (!uf.connected(v, w)) {
                System.err.println("Not a spanning forest");
                return false;
            }
        }

        // check that it is a minimal spanning forest (cut optimality conditions)
        for (Edge e : edges()) {

            // all edges in MST except e
            uf = new UF(G.V());
            for (Edge f : mst) {
                int x = f.either(), y = f.other(x);
                if (f != e) uf.union(x, y);
            }
            
            // check that e is min weight edge in crossing cut
            for (Edge f : G.edges()) {
                int x = f.either(), y = f.other(x);
                if (!uf.connected(x, y)) {
                    if (f.weight() < e.weight()) {
                        System.err.println("Edge " + f + " violates cut optimality conditions");
                        return false;
                    }
                }
            }

        }

        return true;
    }


    /**
     * Unit tests the <tt>kruskal</tt> data type.
     */
    public static void main(String[] args) {
        In in = new In(args[0]);
        EdgeWeightedGraph G = new EdgeWeightedGraph(in);
        kruskal mst = new kruskal(G);
        for (Edge e : mst.edges()) {
            StdOut.println(e);
        }
        StdOut.printf("%.5f\n", mst.weight());
    }
}
/*	static	final int MAX = 10005;
	static int []id=null, nodes, edges;
	static pair <long, pair<int, int> >[] p;
	public static void main(String []args)
	{
	    int x, y;
	    long weight, cost, minimumCost;
	    initialize();
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	    String nodes=br.readLine();
	    String edges=br.readLine();
	    for(int i = 0;i < edges;++i)
	    {
		//cin >> x >> y >> weight;
		//p[i] = make_pair(weight, make_pair(x, y));
	    }
	    // Sort the edges in the ascending order
	    sort(p, p + edges);
	    minimumCost = kruskal(p);
	    System.out.println(minimumCost);
	    
	}
	
	static void initialize()
	{
	    for(int i = 0;i < MAX;++i)
		id[i] = i;
	}

	static int root(int x)
	{
	    while(id[x] != x)
	    {
		id[x] = id[id[x]];
		x = id[x];
	    }
	    return x;
	}

	static void union1(int x, int y)
	{
	    int p = root(x);
	    int q = root(y);
	    id[p] = id[q];
	}

	static long kruskal(pair<long , pair<int, int> > p[])
	{
	    int x, y;
	    long cost, minimumCost = 0;
	    for(int i = 0;i < edges;++i)
	    {
		// Selecting edges one by one in increasing order from the beginning
		x = p[i].second.first;
		y = p[i].second.second;
		cost = p[i].first;
		// Check if the selected edge is creating a cycle or not
		if(root(x) != root(y))
		{
		    minimumCost += cost;
		    union1(x, y);
		}    
	    }
	    return minimumCost;
	}
}*/
