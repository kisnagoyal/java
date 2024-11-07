import java.util.ArrayList;

public class StacksB {
    static class StackArrayList{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }

    }

    public static class StacksLinkedList{
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        StackArrayList s = new StackArrayList();
        StacksLinkedList Sl = new StacksLinkedList();
        Sl.push(1);
        Sl.push(2);
        Sl.push(3);
        
        while(!Sl.isEmpty()){
            System.out.println(Sl.peek());
            Sl.pop();
        }
        
    }
}
