import java.util.*;;

public class QueueTwoStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add o(n)
        public static void add(int data){
            while(!isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove o(1)
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty boss");
                return -1;
            }
            int removed = s1.pop();
            return removed;
        }
        //peek o(1)
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("queue is Empty");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
