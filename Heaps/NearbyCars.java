import java.util.PriorityQueue;

public class NearbyCars {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int dist;
        int idx;
        public Points(int x, int y, int dist, int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }
        @Override
        public int compareTo(Points p2){
            return this.dist - p2.dist;
        }
    }
    public static void main(String args[]){
        int arr[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Points> pts = new PriorityQueue<>();
        for(int i = 0; i<arr.length;i++){
            int dist = arr[i][0]*arr[i][0] + (arr[i][1]*arr[i][1]);
            pts.add(new Points(arr[i][0],arr[i][1], dist, i));
        }

        for(int i = 0 ; i<k;i++){
            System.out.println("C" + pts.remove().idx);
        }
    }
}
