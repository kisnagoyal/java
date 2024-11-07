import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));

        graph[2].add(new Edge(2, 3, 50));
        graph[2].add(new Edge(2, 0, 15));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pairs implements Comparable<Pairs>{
        int v;
        int cost;
        public Pairs(int v, int cost){
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pairs p2){
            return this.cost - p2.cost;
        }
    }
    public static void prims(ArrayList<Edge> graph[] ){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        pq.add(new Pairs(0, 0));
        int finalcost = 0;

        while(!pq.isEmpty()){
            Pairs curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalcost += curr.cost;

                for(int i = 0; i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pairs(e.dst, e.wt));
                }
            }
        }
        System.out.println(finalcost);

    }

    public static void prismEdge(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pairs> pq = new PriorityQueue<>();
        pq.add(new Pairs(0, 0));

        ArrayList<Edge> ans = new ArrayList<>();

        while(!pq.isEmpty()){
            Pairs curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
               
                for(int i =0; i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pairs(e.dst,e.wt));
                }
                ans.add(new Edge(curr.v, pq.remove().v, pq.remove().cost));
            }
        }
        for(int i = 0; i<ans.size();i++){
            System.out.print(ans.get(i).src + "->" + ans.get(i).dst);
            System.out.println();
        }
    }

    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[4];
        crateGraph(graph);
        // prims(graph);
        prismEdge(graph);

    }
}
