import java.util.*;

public class ConnectedComponents {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void crateGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i< graph.length;i++){
            graph[i]  = new ArrayList<>();
        }

        //0 - vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //1 - vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        // 2- vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3 - vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4 - vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
        
    }

    public static void dfsUtil(ArrayList<Edge> graph[],boolean vis[],int curr){ //O(V+E)
        System.out.print(curr + " ");
        vis[curr] = true;
        for(int i = 0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, vis, e.dest);
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[7];
        for(int i = 0; i<graph.length;i++){
            if(!vis[i]){
                dfsUtil(graph, vis,i);
            }
        }
    }
    public static void bfs(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i =0; i< graph.length;i++){
            if(!visited[i]){
                bfsUtil(graph, visited);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge> graph[],boolean visited[]){ //O(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //source is 0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i =0; i< graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String args[]){
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        crateGraph(graph);

        dfs(graph);
        System.out.println();
        bfs(graph);
    }

}
