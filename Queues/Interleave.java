import java.util.*;
public class Interleave {
    public static Queue newQueue(Queue<Integer> q){
       Queue<Integer> first = new LinkedList<>();
       int size = q.size();
       for(int i = 0; i< size/2;i++){  // creating size var becoz size of queue is always changing since we want constant size we stores value of size in some variable
        first.add(q.remove());
       }
       while(!first.isEmpty()){
        q.add(first.remove());
        q.add(q.remove());
       } 
       return q;
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        newQueue(q);
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
