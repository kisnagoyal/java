public class QueuesB {
    static class Queues{
        static int arr[];
        static int size;
        static int rear;
        Queues(int n){
            arr = new int[n];
            size = n;
           rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size-1){
                System.out.println("full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int frontEle = arr[0];
            for(int i = 0; i< rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear -1;
            return frontEle;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("emoty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]){
        Queues q = new Queues(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
