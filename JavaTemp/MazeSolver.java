import java.util.*;

public class MazeSolver {

    private static final int mRows = 15;
    private static final int mCols = 15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] maze = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        int stX = sc.nextInt();
        int stY = sc.nextInt();

        int endX = sc.nextInt();
        int endY = sc.nextInt();

        int shortestPath = findShortestPath(maze, stX, stY, endX, endY);

        if (shortestPath == -1) {
            System.out.println("STUCK");
        } else {
            System.out.println(shortestPath);
        }
    }

    private static int findShortestPath(int[][] maze, int stX, int stY, int endX, int endY) {
        int[][] visited = new int[mRows][mCols];

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(stX, stY, 0));

        while (!q.isEmpty()) {
            Node node = q.poll();

            int x = node.x;
            int y = node.y;
            int dist = node.dist;

            if (x == endX && y == endY) {
                return dist;
            }

            visited[x][y] = 1;

            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];

                if (isValid(maze, newX, newY) && visited[newX][newY] == 0) {
                    if (maze[newX][newY] == 1 || (maze[newX][newY] == 2 && dist >= 2) || maze[newX][newY] == 3) {
                        // Cannot move to this block
                        continue;
                    }

                    q.add(new Node(newX, newY, dist + 1));
                }
            }
        }

        return -1;
    }

    private static boolean isValid(int[][] maze, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length);
    }

    private static class Node {
        public final int x;
        public final int y;
        public final int dist;

        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
