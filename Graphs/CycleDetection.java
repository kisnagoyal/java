import java.util.*;
public class CycleDetection {
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
        graph[0].add(new Edge(0, 1, 0));
        // graph[0].add(new Edge(0, 2, 0));
        graph[0].add(new Edge(0, 3, 0));

        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 2, 0));

        graph[2].add(new Edge(2, 1, 0));
        // graph[2].add(new Edge(2, 0, 0));
        graph[2].add(new Edge(2, 4, 0));

        graph[3].add(new Edge(3, 0, 0));

        graph[4].add(new Edge(4, 2, 0));

    }
    public static boolean detectCycle(ArrayList<Edge> graph[]){ //O(V+E)
        boolean vis[] = new boolean[graph.length];
        for(int i = 0; i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){
                    return true;
                    //cycle exist in one of the parts or component
                }
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge> graph[],boolean vis[],int curr,int parent){
        vis[curr] = true;
        for(int i = 0; i< graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            //case 3
            if(!vis[e.dst]){
                if(detectCycleUtil(graph, vis, e.dst, curr)){
                    return true;
                } 
            }
            //case 1
            else if(vis[e.dst] && e.dst != parent){
                return true;
            }
            //case 2 do nothing -> continue

        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Edge> graph[] = new ArrayList[5];
        crateGraph(graph);

        System.out.println(detectCycle(graph));

    }
}
