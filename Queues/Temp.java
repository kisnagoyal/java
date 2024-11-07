import java.util.*;

public class Temp{

    public static void reverse(Queue<Integer> q , int k){
        Stack<Integer> newq = new Stack<>();
        int size = q.size()-k;
        while(k>0){
            newq.push(q.remove());
            k--;
        }
        while(!newq.isEmpty()){
            q.add(newq.pop());
        }
        while(size >0){
            q.add(q.remove());
            size--;
        }
       
       
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        // System.out.println(q);
        int key = 5;
        reverse(q,key);
        System.out.println(q);
        

    }
}