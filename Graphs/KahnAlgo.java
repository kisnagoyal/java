import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgo {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int dest) {
            this.src = s;
            this.dest = dest;
        }
    }

    public static void crateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topoSort(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }

        }
    }

    private static void calcIndeg(ArrayList<Edge>[] graph, int[] indeg) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void main(String args[]) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        crateGraph(graph);

        topoSort(graph);
    }
}
