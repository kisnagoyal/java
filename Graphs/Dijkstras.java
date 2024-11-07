import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras {
    static class Edge{
        int src;
        int dst;
        int wt;
        public Edge(int src, int dst, int wt){
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }
    }
    public static void crateGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }
    private static void dijkstra(ArrayList<Dijkstras.Edge>[] graph, int src) {
        int dist[] = new int[graph.length];
        for(int i = 0; i< dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                for(int i = 0; i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dst;
                    int wt = e.wt;

                    if(dist[v] > dist[u] +wt){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for(int i = 0; i<dist.length;i++){
            System.out.print(dist[i] + " ");
        }

    }

    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[6];
        crateGraph(graph);

        int src = 0, dest = 1;

        dijkstra(graph,src);
    }

    
}
