import java.util.ArrayList;
import java.util.Collections;

public class KruskalsAlgo {
    static class Edge implements Comparable<Edge>{
        int src;
        int dst;
        int wt;
        public Edge(int src, int dst, int wt){
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }

    static int v = 4;
    static int par[] = new int[v];
    static int rank[] = new int[v];

    public static void init(){
        for(int i = 0; i<v;i++){
            par[i] = i;
        }
    }

    public static int find(int a){
        if(par[a] == a){
            return a;
        }
        return par[a] = find(par[a]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parA] = parB;
            rank[parB]++;
        }
        else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }
        else{
            par[parB] = parA;
        }
    }
    private static void createGraph(ArrayList<KruskalsAlgo.Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1,3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    public static int kruskalMst(ArrayList<Edge> edges,int v){
        Collections.sort(edges); //O(ElongE)
        int finalcost = 0;
        int count = 0;

        for(int i = 0; count<v-1;i++){
            Edge e = edges.get(i);
            int src = e.src;
            int dest = e.dst;
            int wt = e.wt;
            if(find(src) != find(dest)){
                //cycle exist if it is equals
                finalcost += wt;
                count++;
            }
        }
        return finalcost;
    }

    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);

        init();
        System.out.println(kruskalMst(edges, V));
    }
}
