public class ZigZag {

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void zigZag(Node head){
       //mid
       Node slow = head;
       Node fast = head.next;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }
        Node mid = slow;       
       //rev second half
       Node curr = mid.next;
       mid.next = null;         // broke into 2 LL
       Node prev = null;
       Node next;
       while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }

       Node left = head;
       Node right = prev;
       Node nextL, nextR;

       //alternate merging
       while(left != null && right != null){
        nextL  = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        right = nextR;
        left = nextL;
       }
    }

    public void addLast(int data){
        //step 1
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2
        tail.next = newNode;
        //step 3
        tail = newNode;
    }


    public void printll(){  //O(n)
        if(head == null){
            System.out.println("EMPTY");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    } 

    public static void main(String args[]){
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printll();
        zigZag(head);
        ll.printll();

    }
    
}
