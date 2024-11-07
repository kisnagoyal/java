import java.util.ArrayList;

public class BellmanFord {
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

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void bellmanford(ArrayList<Edge> graph[],int src){
        int dist[] = new int[graph.length];
        for(int i = 0; i<dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        int V = graph.length;
        for(int i = 0; i<V-1;i++){
            //all edges O(E)
            for(int j = 0; j< graph.length;j++){
                for(int k = 0; k<graph[j].size();k++){
                    Edge e = graph[j].get(k);
                    if(dist[e.src] != Integer.MAX_VALUE && dist[e.dst] > dist[e.src] + e.wt){
                        dist[e.dst] = dist[e.src] + e.wt;
                    }
                }
            }
        }

        for(int i = 0; i<dist.length;i++){
            System.out.print(dist[i]+ " ");
        }
    }
    private static void crateGraph2(ArrayList<Edge> graph2) {
        graph2.add(new Edge(0, 1, 2));
        graph2.add(new Edge(0, 2, 4));

        graph2.add(new Edge(1, 2, -4));

        graph2.add(new Edge(2, 3, 2));

        graph2.add(new Edge(3, 4, 4));

        graph2.add(new Edge(4, 1, -1));       
    }
    private static void bellmanford2(ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        for(int i = 0; i<dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int i = 0; i<V-1;i++){
            //all edges O(E)
            for(int j = 0; j< graph.size();j++){
                Edge e = graph.get(j);
                if(dist[e.src] != Integer.MAX_VALUE && dist[e.dst] > dist[e.src] + e.wt){
                    dist[e.dst] = dist[e.src] + e.wt;
                }
            }
        }

        for(int i = 0; i<dist.length;i++){
            System.out.print(dist[i]+ " ");
        }
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[5];
        crateGraph(graph);

        ArrayList<Edge> graph2 = new ArrayList<>();
        int V = 5;
        crateGraph2(graph2);

        bellmanford(graph, 0);
        System.out.println();
        bellmanford2(graph2, 0,V);
        //both ways have same time complexity
    }

    
    
}
