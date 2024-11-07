import java.util.ArrayList;

public class DirectedCycle { //O(V+E)
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int dest){
            this.src = s;
            this.dest = dest;
        }
    }
    public static void crateGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
    }
    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i = 0; i< graph.length;i++){
            if(isCycleUtil(graph,i,vis,stack)){
                return true;
            }
        }
        return false;
    }
    private static boolean isCycleUtil(ArrayList<DirectedCycle.Edge>[] graph, int curr, boolean[] vis, boolean[] stack) {
        vis[curr] = true;
        stack[curr] = true;

        for(int i = 0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;//cycle exist
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[5];
        crateGraph(graph);

        System.out.println(isCycle(graph));
    }
}
