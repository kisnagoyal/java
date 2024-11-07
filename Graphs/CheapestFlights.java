import java.util.*;

public class CheapestFlights {
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
    static class Info{
        int v;
        int cost;
        int stops;
        public Info(int v,int c, int s){
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }
    private static void createGraph(ArrayList<Edge>[] graph, int[][] flights) {
        for(int i = 0; i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0; i< flights.length;i++){
            int src = flights[i][0];
            int dst = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dst, wt);
            graph[src].add(e);
        }


    }

    public static int cheapFlight(int flights[][],int src, int dst, int n, int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph,flights);

        int dist[] = new int[n];
        for(int i = 0; i< dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops >k){
                break;
            }
            for(int i = 0; i< graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dst;
                int wt = e.wt;
                if(dist[v] > curr.cost + wt && curr.stops <=k ){//imp step here we replaces dist[u] by curr.cost
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }

        }
        if(dist[dst] == Integer.MAX_VALUE){
            return -1;
        }
        return dist[dst];
    }
    
    public static void main(String args[]){
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dst = 3, k = 1;

        System.out.println(cheapFlight(flights, src, dst, n, k));

    }
}
